Input:
5
2 4 3 8 5

Output:
8
5
4
3
2



import java.util.*;
public class Sorting{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int temp=0;
        int arr[]=new int[val];
        for(int i=0;i<val;i++)
        {
            arr[i]=sc.nextInt();
             
        }
    
        for(int i=0;i<val;i++)
        {
            for(int j=i+1;j<val;j++)
            {
                if(arr[i]<arr[j])
                {
                    
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
             System.out.println(arr[i]);
        }

     }
}