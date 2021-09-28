A physical education teacher asks students to assemble in a straight line for the morning assembly. 
In spite of repeated instructions, the students do not obey the teacher.
Given an array of N number of arguments in which each element represents the height of the student in that position. 
The task here is to find the number of students, only for students numbered 1 to N -1(a[1] to a[N-1]), whose height is less than the height of their adjacent students

Given the heights of students in the queue. the task is to find the number of students,whose heights is less than the heights of their adjacent students

Intput:
5
35 15 45 25 55

Output:
2

solution:     
     
import java.util.Scanner;
public class lessHeightAdjacentStudentsDCA{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < n-2; i++) {
            if (arr[i] > arr[i+1] && arr[i+2] > arr[i+1])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
     
     
 partially correct solution: may be for slightly different questions: 

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
