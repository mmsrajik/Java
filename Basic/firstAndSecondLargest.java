input:
6
9 3 9 8 5 9
output:
9
8


import java.util.*;
public class firstAndSecondLargest{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int val=sc.nextInt();
      int arr[]=new int[val];
      for(int i=0;i<val;i++)
      {
          arr[i]=sc.nextInt();
      }
      int firstl=0;
      int secondl=0;
      for(int i=0;i<val;i++)
      {
          if(arr[i]>firstl)
          {
              secondl=firstl;
              firstl=arr[i];
          }
          else if(arr[i]>secondl && firstl!=arr[i])
          {
              secondl=arr[i];
          }
      }
      
      System.out.println(firstl);
      System.out.println(secondl);


     }
}