input:
6
2 3 3 8 5 5
output:
2
8



import java.util.*;
public class minimumOccuranceCharacters{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int val=sc.nextInt();
      int arr1[]=new int[val];
      int arr2[]=new int[val];
      int min=val;
      for(int i=0;i<val;i++)
      {
          arr1[i]=sc.nextInt();
      }
      for(int i=0;i<val;i++)
      {
          for(int j=0;j<val;j++)
          {
              if(arr1[i]==arr1[j])
              {
                  arr2[i]++;
              }
          }
          
          if(arr2[i]<min)
          {
              min=arr2[i];
          }
      }
      ArrayList al=new ArrayList();
      for(int i=0;i<val;i++)
      {
          if(arr2[i]==min && !al.contains(arr1[i]))
         {
             al.add(arr1[i]);
             System.out.println(arr1[i]);
         } 
      }
      
      

     }
}