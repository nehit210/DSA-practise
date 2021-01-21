import java.io.*;
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            ArrayList<Integer> sol = commonElements(A, B, C, n1, n2, n3);
            if (sol.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < sol.size();i++)
                {
                    System.out.print(sol.get(i) + " ");
                }    
            }
            System.out.println();
        }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> common=new ArrayList<>() ;
        int i=0,j=0,k=0;
        while(i<n1&&j<n2&&k<n3)
        {
           if(A[i]==B[j]&&B[j]==C[k])
           {
               common.add(A[i]);
               i++;
               j++;
               k++;
           }
           else
           if(A[i]>B[j]&&A[i]==C[k])
           {
               j++;
           }
           else
           if(B[j]>A[i]&&B[j]==C[k])
           {
               i++;
           }
           else 
           if(A[i]>C[k]&&A[i]==B[j])
           {
               k++;
           }
           else
           if(A[i]>B[j]&&A[i]>C[k])
           {
               j++;
               k++;
           }
           else
           if(B[j]>A[i]&&B[j]>C[k])
           {
               i++;
               k++;
           }
           else
           if(C[k]>B[j]&&C[k]>A[i])
           {
               i++;
               j++;
           }
           
        }
        
        return common;// code here 
    }
}