input:
6
9 3 9 8 5 9
output:
9
3



import java.util.*;
public class largestAndSmallestNumber{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int val=sc.nextInt();
      int arr[]=new int[val];
      for(int i=0;i<val;i++)
      {
          arr[i]=sc.nextInt();
      }
      int largest=0;
      int smallest=arr[0];
      for(int i=0;i<val;i++)
      {
          if(arr[i]>largest)
          {
             largest=arr[i];
          }
          else if(arr[i]<smallest)
          {
              smallest=arr[i];
          }
      }
      
      System.out.println(largest);
      System.out.println(smallest);


     }
}