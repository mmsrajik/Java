import java.util.*;
import java.math.*;
input:
371
output:
Its Armstrong Number


public class armstrongNumber{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int val=sc.nextInt();
      //int len=(String.valueOf(val)).length();    this line also correct. we can use
      int len=(int)Math.log10(val)+1;
      int temp=val;
      int ans=0;
      while(temp>0)
      {
       ans=ans+(int)Math.pow((temp%10),len);
       temp=temp/10;
      }
      
      if(val==ans)
      System.out.println("Its Armstrong Number");
      else
      System.out.println("Its not an Armstrong Number");
      

     }
}