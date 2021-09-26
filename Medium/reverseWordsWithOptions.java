Reversing Words with options:
Write a function (method) that takes as input a string (sentence) and generates a new string (modified sentence) by reversing the words in the original string, maintaining the words positions.


In addition, the function should be able to control the reversing of the case (uppercase or lowercase) based on a case_option parameter, as follows –


If case_option = 0, Normal reversal of words
i.e. If the original sentence is “Wipro TechNologies BangaLore”, the new reversed sentence should be “orpiW seigoloNhceT eroLagnaB”


If case_option = 1, Reversal of words with retaining position’s Case
i.e. If the original sentence is “Wipro TechNologies BangaLore”, the new reversed sentence should be “Orpiw SeigOlonhcet ErolaGnab” Note that positions 1, 7, 11, 20 and 25 in the original string are uppercase W, T and B. Similarly positions 1, 7, 11, 20 and 25 in the new string are uppercase O, S, O, E and G.


If case_option = 2, Reversal of words including Case
i.e. If the original sentence is “Wipro Technologies Bangalore”, the new reversed sentence should be “ORPIw SEIGOLONHCEt EROLAGNAb”
Note that W, T and B, that were uppercase in original string have become lowercase and all the lowercase letters have become uppercase.


NOTE:
a) Only space character should be treated as the word separator. i.e. “Hello World” should be treated as two separate words “Hello” and “World”. However, “Hello,World”, “Hello;World”, “Hello-World” or “Hello/World” should be considered as a single word.
b) Non-alphabetic characters in the string will not be subjected to case-changes. For example, if case_option=1, and the original sentence is “Wipro TechNologies, Bangalore”, the new reversed sentence should be “Orpiw ,seiGolonhceT Erolagnab”. Note that comma has been treated as part of the word “Technologies,” and because comma had to take the position of uppercase T it remained as a
comma and uppercase T took the position of comma. However the words “Wipro” and “Bangalore” have changed to “Orpiw” and “Erolagnab”.
c) Some more examples –
Input string = “I Am alWays 24#7 Busy.”
With case-option = 0, reversed string will be “I mA syaWla 7#42 .ysuB”
With case-option = 1, reversed string will be “I Ma syAwla 7#42 .ysuB”
With case-option = 2, reversed string will be “i Ma SYAwLA 7#42 .YSUb”
d) Please ensure that no extra (additional) space characters are embedded within the resultant reversed string.




import java.util.*;
public class reverseWordsWithOptions{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         int val=sc.nextInt();
         
         
         String arr[]=str.split(" ");
         
         switch(val)
         {
             case 0:
                 {
                     for(int i=0;i<arr.length;i++)
                     {
                     StringBuffer sb=new StringBuffer(arr[i]);
                     System.out.print(sb.reverse()+" ");
                     
                     }
                     break;
                 }
            case 1:
                {
                    
                    for(int i=0;i<arr.length;i++)
                    {
                    StringBuffer sb=new StringBuffer(arr[i]);
                     String temp=new String(sb.reverse());
                     
                     String virtual="";
                     
                     for(int j=0;j<arr[i].length();j++)
                     {
                     if(Character.isUpperCase(arr[i].charAt(j)))
                     {
                         if(Character.isLetter(temp.charAt(j)) || Character.isDigit(temp.charAt(j)))
                         {
                         System.out.print((temp.substring(j,j+1)).toUpperCase());
                         }
                         else
                         {
                             virtual=temp.substring(j,j+1);
                         System.out.print(temp.substring(j,j+1));
                         }
                     }
                     else if(virtual.equals(arr[i].substring(j,j+1)))
                     {
                         System.out.print((temp.substring(j,j+1)).toUpperCase());
                     }
                     else
                     {
                         System.out.print((temp.substring(j,j+1)).toLowerCase());
                     }
                     }
                     
                     
                     System.out.print(" ");
                    }
                    
                    break;
                }
            case 2:
            {
                
                for(int i=0;i<arr.length;i++)
                {
                StringBuffer sb=new StringBuffer(arr[i]);
                String temp=new String(sb.reverse());    
                    
                for(int j=0;j<temp.length();j++)
                {
                    if(Character.isUpperCase(temp.charAt(j)))
                    {
                        System.out.print(temp.substring(j,j+1).toLowerCase());
                    }
                    else
                    {
                        System.out.print(temp.substring(j,j+1).toUpperCase());
                    }
                }
                System.out.print(" ");
                    
                }
                
                break;
            }
             
             
         }
         
     }
}

