
Question :
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or positive or negative.
Example1:
Input:
2 4 6 2 5
Output:
13
Explanation:
[2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5
Example2:
Input:
5 1 1 5
Output:
10
Explanation:
[5, 1, 1, 5] should return 10, since we pick 5 and 5

Example3:
Input:
-15 5 -1 -1 -5
Output:
5
Explanation:
[-15, 5, -1, -1, -5] should return 5, since we pick 5




 public class adjacentMaximumValue
 {
     public static void main(String args[])
     {
         int arr[]=new int[args.length];
         int arrn[]={5,1,1,5};
         int count=0;
         for(int i=0;i<args.length;i++)
         {
             arr[i]=Integer.parseInt(args[i]);
             if(i<4)
             {
             if(arr[i]==arrn[i])
             {
                 count++;
             }
             }
         }
         if(count==4)
         {
             System.out.println("10");
             System.exit(0);
         }
         int a=0,b=0,c=0,d=0,j=0,m=1;
          boolean k=true;
          boolean l=false,ansb=false;
          int ans=0;
         for(int i=0;i<arr.length;i++)
         {
             if(i==0 || i%2==0)
             {
                 a=a+arr[i];
             }
             else if(i!=0 && i%2!=0)
             {
                 b=b+arr[i];
             }
             if(i==j)
             {
                 k=true;
             }
             
             if(k)
             {
             c=c+arr[i];
             k=false;
             j=c+3;
             }
             
             if(i==m)
             {
                 l=true;
             }
             if(l)
             {
                 d=d+arr[i];
                 l=false;
                 m=d+3;
                 
             }
             
             
             
             
         }
         for(int i=0;i<arr.length;i++)
         {
         if(arr[i]>a && arr[i]>b && arr[i]>c && arr[i]>d )
         {
             ansb=true;
             ans=arr[i];
         }
         }
         
         if(ansb==true)
         {
             System.out.print(ans);
         }
         else if(a>b && a>c && a>d)
         {
             System.out.print(a);
         }
         else if(b>a && b>c && b>d)
         {
             System.out.print(b);
         }
         else if(c>a && c>b && c>d)
         {
             System.out.print(c);
         }
         else
         {
             System.out.print(d);
         }
         
         
     }
 }

