Question :
Caesar's Code is one of the simplest encryption techniques. Each letter in the plaintext is replaced by a letter some fixed number of position (n) down the alphabet cyclically. 
For example, if n is 3, 'A' or 'a' is replaced by 'D', 'B' or 'b' by 'E', 'C' or 'c' by 'F', ..., 'X' or 'x' by 'A', ..., 'Z' or 'z' by 'C'.
Write a program called CaesarCode to cipher the Caesar's code. The program shall prompt user for a plaintext string(consisting of mix-case letters only) and n; compute the ciphertext; and print the ciphertext in uppercase. For example,
Input format:
First line contains plaintext string and second line contains an integer n
Output format:
A line contains encrypted string in uppercase.
Example:

Input:
Testing
3
Output:
WHVWLQJ






import java.util.*;
public class cipherTextEncoding
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        String nstr="";
        str=str.toUpperCase();
        int a,b;
        char c;
        for(int i=0;i<str.length();i++)
        {
            a=(int)str.charAt(i);
            if(((a+n)>90))
            {
                b=(a+n)-90;
                a=64+b;
            }
            else
            {
            a=a+n;
            }
            c=(char)a;
            nstr+=c;
            
        }
        System.out.println(nstr);
    }
}
