Question – 3: Identify Possible Words

•	Detective bakshi while solving a case stumbled upon a letter which had many words whose one character was missing i.e.  One character in the word was replaced by an underscore. 
•	For e.g. “Fi_er”. He also found thin strips of paper which had a group of words separated by colons, for e.g. “Fever:filter:Filter:Fixer:fiber:tailor:offer”. 
•	He could figure out that the word whose one character was missing was one of the possible words from the thin strips of paper. 
•	Detective Bakshi has approached you (a computer programmer) asking for help in identifying the possible words for each incomplete word. 
•	You are expected to write a function to identify the set of possible words.


The prototype of the function is:
public static void identifyPossibleWords(String input1, String input2) { }
Where input1 contains the incomplete word, and
input2 is the string containing a set of words separated by colons.

The function is expected to find all the possible words from input2 that can replace the incomplete word input1, and then assign the result in the output1 member.

Assumption(s):
•	Input1 will contain only a single word with only 1 character replaced by an underscore “-“
•	Input2 will contain a series of words separated by colons and NO space character in between
•	Input2 will NOT contain any other special character other than underscore and alphabetic characters.

Example 1
Input
Fi_er
Fever:filter:Filter:Fixer:fiber:fibre:tailor:offer
Output
FILER:FIXER:FIBER

Example 2
Input
t_xer
Thank:Time:tiger:trial:fixer:final:Alpha:tiler:Tiles:tider
Output
ERROR

Input Format: 
First line contains the incomplete word and second line contains set of words separated by colons.
Output Format:
Output contains all the possible words from input2 that can replace the incomplete word input1.



Test Case 1:
Input
Fi_er
Fever:filter:Filter:Fixer:fiber:fibre:tailor:offer
Output
FILER:FIXER:FIBER

Test Case 2:
Input
t_xer
Thank:Time:tiger:trial:fixer:final:Alpha:tiler:Tiles:tider
Output
ERROR

Test Case 3:
Input
thi_
Thin:That:Those:this:what:Thip:why:Whap:than:THAR:thick
Output
THIN:THIS:THIP

Test Case 4:
Input
F_ber
Fever:filter:Filter:Fixer:fiber:fibre:tailor:offer
Output
FIBER
 
Test Case 5:
Input
ti_er
Thank:Time:tiger:trial:fixer:final:Alpha:tiler:Tiles:tider
Output
TIGER:TILER:TIDER

Test Case 6:
Input
wh_
Thin:That:Those:this:what:Thip:why:Whap:than:THAR:thick
Output
WHY




import java.util.*;
public class identifyExactWord{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toUpperCase();
        String str2=sc.nextLine().toUpperCase();
        String arr[]=str2.split(":");
        int index=0;
        char a;
        String nstr="";
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            if(str.length()==arr[i].length())
            {
            index=str.indexOf('_');
            a=arr[i].charAt(index);
            nstr=str.substring(0,index)+a+str.substring(index+1,str.length());

  
            if(nstr.equals(arr[i]))
            {
                
                ans=ans+nstr+":";
            
            }
            
            }
            
           
            
        }
        
        if(ans.equals(""))
        {
         System.out.println("ERROR");   
        }
        else
        {
        System.out.println(ans.substring(0,ans.length()-1));
        }

     }
}


