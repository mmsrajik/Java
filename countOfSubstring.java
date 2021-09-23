Count the Substring
For the given String, split all the possible substring. Find the number of substrings which contains the given character.
Example:
Input String => mania
All possible substrings =>
ma
an
ni
ia
man
ani
nia
mani
ania
mania
Input character to count => m
Output => 4 (from the 10 possible substrings, only 4 substrings contain the given character m)


import java.util.*;
public class countOfSubstring{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                temp=str.substring(i,j);
                if(j!=i+1 && temp.contains("m"))
                {
                    count++;
                }
            }
        }
        
        
        System.out.println(count);
     }
}