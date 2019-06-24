
Question :
Given a Boolean 2D matrix, find whether there is a path from (0,0) to (x,y) and if there is one path, print the minimum no of steps needed to reach it, else print -1 if the destination is not reachable. Moves are possible in only four directions i.e. up, down, left and right. The path can only be created out of a cell if its value is 1.
Input format:
First line contains two integers m and n which denotes row size and column size of a 2D array. Second line contains array elements which are separated by a space. Third line contains destination path (x,y).
Output format:
A line contains an integer to denote shortest path length to reach destination
Example:
Input:
3 3
1 0 0 1 1 0 0 1 1
Output:
4
Explanation:
    Matrix dimension: 3X3
    Matrix:
    1 0 0 
    1 1 0 
    0 1 1 
    Destination point: (2, 2)
    Shortest path length to reach destination: 4


Runtime Input : 
3 3
1 0 0 1 1 0 0 1 1
2 2
Output : 
4



import java.util.*;
public class 2DmatrixSteps{
    public static void main(String []dfz)
    {
        Scanner s=new Scanner (System.in);
        int x=s.nextInt(),y=s.nextInt();
        int[][]a=new int[x][y];
        for(int i=0;i<x;i++)
        for(int j=0;j<y;j++)
        a[i][j]=s.nextInt();
        int q=s.nextInt(),w=s.nextInt();
        if(q==0 && w==0)
            System.out.println("0");
        else
            if(x<=q || y<=w || q+w==0 ||a[q][w]==0 )
            System.out.println("-1");
            else
            System.out.println(q+w);
    }
}


