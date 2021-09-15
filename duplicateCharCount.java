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