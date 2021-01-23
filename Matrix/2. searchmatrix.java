import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
        int target=sc.nextInt();
        System.out.println(searchMatrix(matrix,target));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
      int r=matrix.length;
      int c=matrix[0].length;
        int b=0,e=(r*c)-1;
        while(b<=e)
        {
            int mid=b+(e-b)/2;
            if(matrix[mid/c][mid%c]==target)
            {
                return true;
            }
            if(matrix[mid/c][mid%c]>target)
            {
                e=mid-1;
            }
            else
            {b=mid+1;}
                
        }
      return false;
    }
}