input:
6
9 3 9 8 5 9
6 2 9 9 3 7
Output:
9
3



import java.util.*;
public class commonElementsBetweenArrays{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int val=sc.nextInt();
      int arr1[]=new int[val];
      int arr2[]=new int[val];
      for(int i=0;i<val;i++)
      {
          arr1[i]=sc.nextInt();
        
      }
      for(int i=0;i<val;i++)
      {
          arr2[i]=sc.nextInt();
      
      }
      ArrayList al=new ArrayList();
      
      for(int i=0;i<val;i++)
      {
          for(int j=0;j<val;j++)
          {
          if((arr1[i]==arr2[j])  && !al.contains(arr1[i]))
          {
              System.out.println(arr1[i]);
              al.add(arr1[i]);
              break;
          }
          }
      }
      

     }
}