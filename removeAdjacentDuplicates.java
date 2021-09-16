Write a Java program to remove all adjacent duplicates recursively from a given string
The given string is: aabaarbarccrabmq
The new string after removing all adjacent duplicates is:
brmq


import java.util.*;
public class removeAdjacentDuplicates{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp=str;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                
                temp=temp.replace(str.substring(i,i+1),"");
                 
            }
        }
        
        char arr[]=temp.toCharArray();
        LinkedHashSet lhs=new LinkedHashSet();
        for(int i=0;i<arr.length;i++)
        {
            lhs.add(arr[i]);
        }
        Iterator itr=lhs.iterator();
        while(itr.hasNext())
        {
            Object obj=itr.next();
            System.out.print(obj);
        }
        
     }
}