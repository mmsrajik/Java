Java Program to print all permutations of a given string

Input:
ABC

output:
ABC
ACB
BAC
BCA
CBA
CAB


program:

import java.util.*;
public class Permutation{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in); 
        String str=sc.nextLine();
        int len=str.length();
       Permutation obj=new Permutation();
       obj.permute(str,0,len-1);
       
     }
     
     
     private void permute(String str,int l,int m)
     {
         if(l==m)
         {
             System.out.println(str);
         }
         else
         {
         for(int i=l;i<=m;i++)
         {
             str=swap(str,l,i);
             permute(str,l+1,m);
             str=swap(str,l,i);
         }
         }
         
     }
     
     public String swap(String str,int i,int j)
     {
         char arr[]=str.toCharArray();
         char temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         return String.valueOf(arr);
     }
}