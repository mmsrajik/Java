Let us find out whether the sum of the digits of the given positive integer number N is UNO or not. Given a positive integer number N, reduce the number of digits of N by computing the sum of all the digits to get a new number. If this new number exceeds 9, then sum the digits of this new number to get another number and continue this way until a single digit value is obtained as the ‘digit sum’. The task here is to find out whether the result of the digit sum done this way is ‘1’ or not.

If the digit sum result is 1, display a message UNO If the digit sum is not 1, display a message NOT UNO

5+1+1+1+2 we get 10. Adding the digits again 1+0 we get the digit sum = 1 , so therefore output will be UNO


input:
51112

output:
UNO


import java.util.*;
public class sumDigits{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        
        
        if(val>0)
        {
        int sum=0;
        while(val>9)
        {
            while(val>0)
            {
                sum=sum+val%10;
                val=val/10;
                
            }
            
            val=sum;
            sum=0;
            
        }
        
        if(val==1)
        {
        System.out.println("UNO");    
        }
        else
        {
        System.out.println("NOT UNO");
        }
        
        }
        
     }
}



other type:

import java.util.*;
public class sumDigits{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        
        
        if(val>0)
        {
        int sum=0;
        
            while(val>0)
            {
                sum=sum+val%10;
                val=val/10;
                
            }
            
        if(sum%9==1)
        {
        System.out.println("UNO");    
        }
        else
        {
        System.out.println("NOT UNO");
        }
        
        }
        
     }
}