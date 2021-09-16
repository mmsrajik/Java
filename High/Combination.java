Given an array of size n, generate and print all possible combinations of r elements in array. For example, if input array is {1, 2, 3, 4} and r is 2, then output should be {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
Following are two methods to do this. 
Method 1 (Fix Elements and Recur) 
We create a temporary array ‘data[]’ which stores all outputs one by one. The idea is to start from first index (index = 0) in data[], one by one fix elements at this index and recur for remaining indexes. Let the input array be {1, 2, 3, 4, 5} and r be 3. We first fix 1 at index 0 in data[], then recur for remaining indexes, then we fix 2 at index 0 and recur. Finally, we fix 3 and recur for remaining indexes. When number of elements in data[] becomes equal to r (size of a combination), we print data[].


Input:

5
1 2 3 4 5
3

output:

1 2 3
1 2 4
1 2 5
1 3 4
1 3 5
1 4 5
2 3 4
2 3 5
2 4 5
3 4 5

program:


import java.util.*;
public class Combination{

    static void combinationUtil(int arr[],int data[],int start,int end,int index, int r)
    {
        
        if(index==r)
        {
           for(int i=0;i<r;i++)
            {
                if(i==r-1)
                {
                    System.out.print(data[i]);
                }
                else
                { 
                    System.out.print(data[i]+" ");
                }
                
            }
            System.out.println();
            return;
        }
        
        for(int i=start;i<=end && end-i+1>=r-index;i++)
        {
            data[index]=arr[i];
            combinationUtil(arr,data,i+1,end,index+1,r);
        }
        
        
    }
 
    static void printCombination(int arr[],int n,int r)
    {
        
        int data[]=new int[r];
        combinationUtil(arr,data,0,n-1,0,r);
        
    }

     public static void main(String []args){
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
             System.out.println(arr[i]);
        }
        int r=sc.nextInt();
       
         printCombination(arr,n,r);
     }
}