Design an algorithm to accept a string from the user and print all duplicate character (which occur more than once) and their count. Characters which appear only once in the string must not be displayed. Also if there are no duplicate characters in the given string a message “No duplicate characters” must be printed.
For example if given String is “Programming” then your output should print
g: 2
r: 2
m: 2




import java.util.*;
public class duplicateCharCount{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int arr[]=new int[str.length()];
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
             if(str.charAt(i)==str.charAt(j))
             {
                 arr[i]++;
             }
            }
        }
        String temp="";
        for(int k=0;k<str.length();k++)
        {
            if(!temp.contains(str.substring(k,k+1)))
            {
                if(arr[k]>1)
                {
                System.out.println(str.charAt(k)+": "+arr[k]);
                temp=temp+str.charAt(k);
                }
            }
        }
        
        if(temp.equals(""))
        {
            System.out.println("No duplicate characters");
        }
        
     }
}
