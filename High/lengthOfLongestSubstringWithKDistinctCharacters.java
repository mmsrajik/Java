How to find the length of the longest substring with K distinct characters?
Write a program to find out the length of the longest substring in it with no more than K distinct characters.
Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".


import java.util.*;
public class lengthOfLongestSubstringWithKDistinctCharacters{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int val=sc.nextInt();
        ArrayList<String> al=new ArrayList<String>();
        String checkstr="";
        int checkstrcount=0;
        int mlength=0;
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                al.add(str.substring(i,j));
                 temp=str.substring(i,j);
                 for(int k=0;k<temp.length();k++)
                 {
                     if(checkstr.contains(temp.substring(k,k+1)))
                     {
                     }
                     else
                     {
                         checkstr=checkstr+temp.substring(k,k+1);
                         checkstrcount++;
                     }
                 }
                 
                 if(checkstrcount==2)
                 {
                     if(temp.length()>mlength)
                     {
                         mlength=temp.length();
                         checkstrcount=0;
                     }
                 }
                 else
                 {
                     checkstrcount=0;
                 }
                 
                checkstr="";
            }
        }
        
        System.out.println(mlength);
        
     }
}