import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    int arr[]=new int[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }

		    System.out.println(findSubarray(arr,n));
		}
		
	}

 // } Driver Code Ends


//User function Template for Java

public static int findSubarray(int[] arr ,int n) 
{
   HashMap<Integer,Integer> hm=new HashMap<>();
   int c=0,sum=0;
   for(int i=0;i<n;i++)
   {
       sum+=arr[i];
       if(sum==0)
       {
           c++;
       }
       if(hm.get(sum)!=null)
       {
           c+=hm.get(sum);
       }
       hm.put(sum,hm.get(sum)!=null?hm.get(sum)+1:1);
   }
   return c;
   //Your code here
}
    



// { Driver Code Starts.


}