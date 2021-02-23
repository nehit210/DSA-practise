import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int findPages(int[]a,int n,int m)
    {
       int l=0,sum=0,ans=0;
       for(int i=0;i<n;i++)
       {
           sum+=a[i];
       }
       int u=sum;
       while(l<=u)
       {
           int mid=(l+u)/2;
           if(solve(a,n, mid, m))
           {
               ans=mid;
               u=mid-1;
           }
           else
           {
               l=mid+1;
           }
           
       }
       return ans;
        //Your code here
    }
    static boolean solve(int a[],int n,int mid, int m)
    {
        int s=0,stu=1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>mid)
            {
                return false;
            }
            if(s+a[i]>mid)
            {
                stu++;
                s=a[i];
                if(stu>m)
                {
                    return false;
                }
            }
            else
            s+=a[i];
        }
        return true;
    }

};