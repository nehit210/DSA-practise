import java.io.*;
import java.util.*;
class Solution {
    static void sortedMatrix(int N, int Mat[][]) {
        int temp[]=new int[N*N];
        int k=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                temp[k++]=Mat[i][j];
            }
        }
        Arrays.sort(temp);
        k=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                Mat[i][j]=temp[k++];

            }
        }
    }
    static void printMat(int Mat[][], int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print( mat[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]-new int[n*n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               mat[i][j]=sc.nextInt(); 
            }
        }
        sortedMatrix(mat, n);
        printMat(Mat, n);
    
    }
}
