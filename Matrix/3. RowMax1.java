import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int res=rowWithMax1s(a,n,m);
        system.out.println(res);
        
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        int i,j,max=0,point=-1,count;
        for( i=0;i<n;i++)
        { 
            count=0;
            for( j=m-1;j>=0;j--)
            {
                if(arr[i][j]==1)
                {
                    ++c;
                }
                else
                    break;
            }
            if(max<count)
            {
                max=count;
                point=i;
            }
        }
        return point;
        // code here
    }
}