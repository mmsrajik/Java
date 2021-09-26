Question – 1: Find Password
Detective Buckshee Junior has been approached by the shanthiniketan kids society for help in finding the password to the games complex. After hearing the scenario, detective Buckshee Junior realizes that he will need a programmer’s support. He contacts you and requests your help. Please help the detective by writing a function to generate the password.


The Scenario is as below
•	Five numbers are available with the kids.
•	These numbers are either stable or unstable.
•	A number is stable if each of its digit occur the same number of times, i.e. the frequency of each digit in the number is the same. For e.g. 2277,4004,11,23,583835,1010 are examples of stable numbers.
•	Similarly, a number is unstable if the frequency of each digit in the number is NOT the same. 
For e.g 221,4314,101,233,58135,101 are examples of unstable numbers.

The password can be found as below:
•	i.e. password = sum of all unstable numbers

Function Prototype
public int findPassword(int input1, int input2, int input3, int input4, int input5);


Example
Input
5
12 1313 122 678 898
Output
1020


Input Format: 
First line contains an integer N and second line contains N elements separated by space.
Output Format:
Output contains sum of all unstable numbers



Test Case 1:
Input
5
12 1313 122 678 898
Output
1020

Test Case 2:
Input
5
123 1313 1221 6688 898
Output
898

Test Case 3:
Input
5
11 22 33 44 55
Output
0

Test Case 4:
Input
5
10 23 344 46 57
Output
344

Test Case 5:
Input
5
221 11 101 233 2277 23
Output
555

Test Case 6:
Input
5
2277 4004 111 222 4314 1010
Output
4314










import java.util.*;
public class addingUnstableFrequencyDigits{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         
         int val=sc.nextInt();
         sc.nextLine();
         String str=sc.nextLine();
         String arr[]=str.split(" ");
         int sum=0;
         
         for(int i=0;i<arr.length;i++)
         {
             int narr[]=new int[arr[i].length()];

             for(int j=0;j<arr[i].length();j++)
             {
                for(int k=0;k<arr[i].length();k++)
                 {
                     if(arr[i].substring(j,j+1).equals(arr[i].substring(k,k+1)))
                     {
                         narr[j]++;  
                     }
                 }
             }
            
             int temp=narr[0];
             for(int z=0;z<arr[i].length();z++)
             {
                 
                         if(temp!=narr[z])
                         {
                             sum=sum+Integer.parseInt(arr[i]);
                             break;
                         }
             }
         }
         
        System.out.println(sum);
     }
}
