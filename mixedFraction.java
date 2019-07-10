Question :
Given a string representing a simple fraction x/y, your function must return a string representing the corresponding mixed fraction in the following format:
[sign]a b/c
where a is integer part and b/c is irreducible proper fraction. There must be exactly one space between a and b/c. Provide [sign] only if negative (and non zero) and only at the beginning of the number (both integer part and fractional part must be provided absolute).
If the x/y equals the integer part, return integer part only. If integer part is zero, return the irreducible proper fraction only. In both of these cases, the resulting string must not contain any spaces.
Division by zero should raise an error "Divide by Zero".
Examples
    Input: 42/9, expected result: 4 2/3    
    Input: 0/18891, expected result: 0
    Input: -10/7, expected result: -1 3/7
    Inputs 3/0 expected result: Divide by Zero

Runtime Input : 
42/9
Output : 
4 2/3



import java.util.*;
import java.math.*;
public class mixedFraction
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    if(s1.contains("/"))
    {
        String bb[]=s1.split("/");
        int val=Integer.parseInt(bb[0]);
        int div=Integer.parseInt(bb[1]);
        if(val==0)
        {
            System.out.print(val);
        }
        else if(div==0)
        {
            System.out.print("Divide by Zero");
        }
        else
        {
            int y=val/div;
            if(y!=0)
            {
                System.out.print(y);
                int c=y*div;
                if(c!=val)
                {
                    int check=val-c;
                    check=Math.abs(check);
                    for(int i=div;i>=2;i--)
                        if(div%i==0 && check%i==0)
                        {
                            div=div/i;
                            check=check/i;
                            break;
                        }
                        System.out.print(" "+check+"/"+div);
                }
            }
            else
                System.out.print(s1.trim());
                    
                }
            }
            else
            {
                System.out.print(s1.trim());
            }
        }
    }
    
