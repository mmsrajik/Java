/*
Question :
Message controlled robot movement with 90 degrees turning capability and 1 unit moving capability
Harish, an engineering student needs to submit his final year project. He decides to create a Robot which can be controlled by a set of instructions. He also decides that grid ( of  X and Y axis)should be defined and the robot  should move only within that grid. The set of instructions to move the robot should be given as a single message(string) and the Robot should accordingly move and reach the expected location. If the given instructions lead to a position which is out of the given grid, the Robot should stop at the last valid instruction.
Harish decides to write a code  that should process the given inputs and return a string representing the final position of the Robot.
The program will take 4 input parameters that define the size of the grid(X and Y axis), the current position of the Robot, and the message(string) containing the set of movement instructions.
The first two input parameters define the size of the grid.
input1 =X axis of the grid
input2=Y axis of the grid
Note that input1 and input2 will always be >0.So,the valid grid area for the robot's movement should be the rectangular area formed between the diagonal ends (0,0) and (X,Y)
The third parameter defines the current (starting) position of the robot.
Input3=current position of the robot, represented as a string containing 3 values separated by   a  -(hyphen). The format of input3 is x-y-D, where x and y represent the current(starting) position of the robot and D represents the direction where the robot is currently facing. Valid values for direction D are E,W,N, or S, representing East, West, North, and South respectively.
The fourth input parameter represents the single message containing the set of instructions to move the robot.
input4 =movement instructions to the robot, represented as a string containing the instructions separated by a space. The message will consist of a series of M,L or R ,where

M means "Move 2 unit forward in the direction that the robot is facing".
m means "Move 1 unit forward in the direction that the robot is facing".
L  means "Turn 90� towards left", and
R  means "Turn 90� towards right".
 
Output expected to be printed by the program �
The program is expected to process the given inputs and print a string representing the final position of the Robot. The returned string should be of the format x-y-D, where x and y represent the final(end) position of the robot and D represents the direction where the robot is finally facing. Valid values for direction D are E,W,N, or S, representing East, West, North and South respectively. Note that an "-ER" must be appended to the output string if the traversal finally stopped due to an invalid move (see the below two examples for more clarity on this)
Note:
1.You can assume the grid to be similar to the 1st quadrant of the regular graph sheet. In a regular graph sheet of dimensions x units and y units,(0,0) is the bottom left corner and (X,Y) is the top right corner. Ex: For a grid of 5 x 5,the bottom left corner will be (0,0) and top right corner will be(5,5).
2.The starting position of the robot (third input parameter) will be any position on the grid.i.e.it need      not always be (0,0)
3.You can assume that the current position (starting position, specified in input3) will always be a valid position within the specified grid.
4.IMPORTANT � Note that the instructions L and R only change the direction of the robot without moving it .The instruction M moves the robot 1 unit forward in the direction that the robot is facing.
5.Invalid moves should not be allowed- Any move that could lead the robot to a position beyond (outside) the defined x and y axis of the grid OR below 0 on either x or y axis, should be considered an invalid move.(see below examples to get clarity)
Example1-
input1: x=3
input2: y=3
input3: 2-2-E
input4: R m L m L m
Output: 3-2-N
Explanation:
The size  of the grid 3x3 units. Current (starting) position of the robot is ( 2, 2 ) facing East. After processing the set of instructions given in input4, the new position will be in ( 3 , 2 ) facing North. So, the program is expected to return the output in the format x-y-D i.e. 3-2-N
Example2-
input1: x=3
input2: y=4
input3: 2-2-E
input4: R m L m L m R m
Output: 3-2-E-ER
Explanation:
The size of the grid is 3x4 units. Current (starting) position of the robot is (2,2) facing East. After processing the set of instructions given in input4,the new position will be in (3,2) facing East .Note that the last instruction (M) leads to a position outside the grid, so the valid moves stop at R which is the second last instruction .In this case, the program is expected to return the output representing the last valid position appended with "-ER" representing ERROR. So, the program should return the output as       3-3-E-ER
IMPORTANT NOTE: The output format should be strictly as specified above. Any extra spaces before, after or within the output string will result in failure. Also, the alphabets in the output string should be in upper-case.
NOTE: The above few examples are only to help you understand the question. The actual test-case values will be different from these, so you must ensure to check the result for all possible cases.



*/





import java.util.*;
public class robottype2{
    public static void main(String []aear){
        Scanner s=new Scanner (System.in);
        int posX=s.nextInt();
        int posY=s.nextInt(), con=0;s.nextLine();
        String rrrr=s.nextLine();
        String posss=s.nextLine();
        String dd="sWNESWN",ee="";
        String [] loc=posss.split(" ");
        int rX=(int)(rrrr.charAt(0)) - 48;
        int rY=(int)(rrrr.charAt(2)) - 48;
        String dir=Character.toString(rrrr.charAt(4));
        for(int i=0;i<loc.length;i++){
            String face=loc[i];
            if(face.equals("L") || face.equals("R")){
                int find=dd.indexOf(dir);
                if(face.equals("L")){
                    dir=Character.toString(dd.charAt(find-1));
                    dir=dir.toUpperCase();
                } else {
                    dir=Character.toString(dd.charAt(find+1));
                }
            } else if(face.equals("M") || face.equals("m"))  {
                int mov=1;
                if(face.equals("M")){
                    mov=2;
                }
                if(dir.equals("N")){
                    if(rY+mov<=posY){
                        rY+=mov;
                    } else {
                        con=1;
                    }
                } else if(dir.equals("E")){
                    if(rX+mov<=posX){
                        rX+=mov;
                    } else {
                        con=1;
                    }
                } else if(dir.equals("S")){
                    if(rY-mov>=0){
                        rY-=mov;
                    } else {
                       con=1;
                    }
                } else if(dir.equals("W")){
                    if(rX-mov>=0){
                        rX-=mov;
                    } else {
                        con=1;
                    }
                } if (con==1){
                    ee="-ER";break;
                }
            }
        } 
        System.out.print(rX+"-"+rY+"-"+dir+ee);
    }
}







