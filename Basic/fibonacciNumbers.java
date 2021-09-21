input:
10
output:
0
1
1
2
3
5
8
13
21
34


import java.util.*;
public class fibonacciNumbers{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int val=sc.nextInt();
     
     int n1=0;
     int n2=1;
     int sum=0;
     System.out.println(n1);
     System.out.println(n2);
     
     for(int i=2;i<val;i++)
     {
         sum=n1+n2;
         System.out.println(sum);
         n1=n2;
         n2=sum;
     }
     }
}