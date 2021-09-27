Given the heights of students in the queue. the task is to find the number of students,whose heights is less than the heights of their adjacent students

Intput:
5
35 15 45 25 55

Output:
2



import java.util.*;
public class lessHeightAdjacentStudentsDCA{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                count++;
            }
        }
        
        System.out.println(count);
     }
} 