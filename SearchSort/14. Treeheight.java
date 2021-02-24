import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int l=arr[0],u=arr[n-1],ans=0;
       while(l<=u)
       {
           int mid=(l+u)/2;
           if(solve(a,n, mid, m))
           {
               ans=mid;
               l=mid+1;
           }
           else
           {
               u=mid-1;
           }
           
       }
       System.out.println(ans);
        //Your code here
    }
    static boolean solve(int a[],int n,int mid, int m)
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>mid)
            {
                s=s+(a[i]-mid);
            }
            if(s>=m)
            {
            	return true;
                
            }
        }
        return false;;
    }
}