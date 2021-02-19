import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
       long prod[]=new long[n];
       long p=1;
       int c=0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]==0)
           {
               c++;
           }
           else
           {
               p=p*arr[i]; 
           }
       }
       if(c>1)
       {
           return prod;
       }
       for(int i=0;i<n;i++)
       {
           if(arr[i]==0)
           {
               prod[i]=p;
           }
           else
           {
               prod[i]=(c==1)?0:p/arr[i];
           }
       }
       return prod;// code here
	} 
} 