Longest subarray with sum divisible by k
Given an arr[] containing n integers and a positive integer k. The problem is to find the length of the longest subarray with sum of the elements divisible by the given value k.

Example:
Input: arr[] = {2, 7, 6, 1, 4, 5}, k = 3

Output: 4
The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.

Input Format:
6
2  7  6  1  4  5
3
Output Format:
4




import java.util.*;
public class lengthOfLongestSubarrayDivisibleByK{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int val=sc.nextInt();
      int arr[]=new int[val];
      int ans=0;
      for(int i=0;i<val;i++)
      {
          arr[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      int temp=0;
      int count=0;
      for(int i=0;i<arr.length-1;i++)
      {
          for(int j=i+1;j<arr.length;j++)
          {
              for(int z=i;z<=j;z++)
              {
                  temp=temp+arr[z];
                  count++;
        
              }
              
              if(temp%k==0)
              {
                  if((temp/k)>ans)
                  {
                      ans=count;
                  }
              }
              count=0;
              temp=0;
              
          }

      }
      
      System.out.println(ans);

     }
}