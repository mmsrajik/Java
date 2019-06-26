//  digitSum : sum of all digits in N


import java.io.*;
import  java.util.*;
public class sumDigit
{
public static void main(String args[])
{
int n=0,checkval;
if(input1<0)
{
	input1=input1*-1;
n=1;
}
checkval=DigitSum(input1);

if(n==1)
	return -checkval;
	else
	return checkval;
	}


int DigitSum(int num)
        {
            int sum = 0;
            while (num > 0)
            {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 9)
            {
                sum = DigitSum(sum);
            }
            return sum;
        }
	
}