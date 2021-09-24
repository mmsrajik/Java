String Shuffle Check:
The method is expected to check the fourth string is formed from other three strings for a given four strings.
 Given 4 strings string1, string2, striing3 and string4, fourth string is said to be a shuffle of first, second and third if it can be formed by interleaving the characters of first, second and third string in a way that maintains the left to right ordering of the characters from each string.
 Strings are all case sensitive and same to be maintained
 Strings may contains alphabet, numbers and special characters
 Strings contains no spaces
 If same sequence matches more than one string then consider the sequence from strings in the order of string1, string2 and string3
Example 1:
string1 = abcde
string2 = mnop
string3 = xyz
string4 = axymbcnozpde
output1 = valid shuffle string
Example 2:
string1 = Wipro
string2 = PRPTraining
string3 = ksrcecampus
string4 = kPRsrWPTcecaiprainrmpinusgo
output1 = valid shuffle string
Example 3:
string1 = Test
string2 = Shuffle
string3 = stRing
string4 = TesSsthuftfleRing
output1 = valid shuffle string
Example 4:
string1 = Test
string2 = Shuffle
string3 = stRing string4 = tesSsthuftfleRing =>lower case instead of upper case, so invalid
output1 = invalid shuffle string
Example 5:
string1 = Test
string2 = Shuffle
string3 = stRing string4 = ShuffleRingstTets => the character order not preserved
output1 = invalid shuffle string
Note: In the string4 ShuffleRingstTets contains “st” which (same sequence) is in “Test” and “stRing” strings. Priority order is string1, string2 and string3. Therefore “st” is formed from “Test”.
Example 6:
string1 = a1b2c
string2 = b3c
string3 = x9z
string4 = ax19zb2bc3c
output1 = valid shuffle string
Example 7:
string1 = a1b2c
string2 = +b3c
string3 = x9@
string4 = ax19+@b2bc3c
output1 = valid shuffle string
Example 8:
string1 = abc
string2 = def
string3 = ghi
string4 = abcdefghiz
output1 = invalid shuffle string



import java.util.*;
public class stringShufflecheck{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[3];
        for(int i=0;i<3;i++)
        {
        arr[i]=sc.nextLine();
            
        }
        String strv=sc.nextLine();
        
        int count=0;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                
             for(int k=temp;k<strv.length();k++)
             {
                 if(arr[i].charAt(j)==strv.charAt(k))
                 {
                     count++;
                     temp=k+1;
                     break;
                 }
             }
            }
            
            if(count!=arr[i].length())
            {
                System.out.println("invalid shuffle string");
                System.exit(0);
            }
            count=0;
            temp=0;
        }
        
        System.out.println("valid shuffle string");
     }
}