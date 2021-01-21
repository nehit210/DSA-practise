import java.io.*;
import java.util.*;
class Subseq
{   
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[10];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("The longest consecutive subsequence is"+ findLongestConseqSubseq(arr,n));
   }
	static int findLongestConseqSubseq(int arr[], int N)
	{  
	    HashSet<Integer> hs=new HashSet<Integer>();
	    int longest=0,j;
	   for(int i=0;i<N;i++)
	   {
	       hs.add(arr[i]);
	   }
	   for(int i=0;i<N;i++)
	   {
	       if(!hs.contains(arr[i]-1))
	       {
	           j=arr[i];
	           while(hs.contains(j))
	           j++;
	           if(longest<j-arr[i])
	           {
	               longest=j-arr[i];
	           }
	       }
	   }
	   return longest;
	   // add your code here
	}
}