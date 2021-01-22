import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res=spirallyTraverse(matrix,r,c);
        for(Integer n:res)
        {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> x=new ArrayList<>();
        int top=0,down=r-1,left=0,right=c-1;
        int point=0;
        while(top<=down&&left<=right)
        {
           if(point==0)
        {
            for(int i=left;i<=right;i++)
            {
                x.add(matrix[top][i]);
            }
            top++;
        } 
        else
        if(point==1)
        {
            for(int i=top;i<=down;i++)
            {
                x.add(matrix[i][right]);
            }
            right--;
        }
        else
        if(point==2)
        {
            for(int i=right;i>=left;i--)
            {
                x.add(matrix[down][i]);
            }
            down--;
        }
        else
        if(point==3)
        {
            for(int i=down;i>=top;i--)
            {
                x.add(matrix[i][left]);
            }
            left++;
        }
        point=(point+1)%4;
        }
        return x;
        // code here 
    }
}