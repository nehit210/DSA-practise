import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext())
		{
		    int t=sc.nextInt();
		    while(t-->0)
		    {
		        int n = sc.nextInt();
		        int c = sc.nextInt();
		        int arr[] = new int[n];
		        for(int i=0;i<n;i++){
		            arr[i] = sc.nextInt();
		        }
		        Arrays.sort(arr);
		        int min=arr[0];
		        int max=arr[n-1];
		        int ans=0;
		        while(min<=max)
		        {
		            int mid = (min+max)/2;
		            int cow=1;
		            int prev=arr[0];
		            for(int i=0;i<n;i++)
		            {
		                if(arr[i]-prev>=mid)
		                {
		                    cow++;
		                    prev=arr[i];
		                    if(c==cow)
		                    break;
		                }
		            }
		            if(cow==c)
		            {
		                ans=mid;
		                min=mid+1;
		            }
		            else
		            {
		                max=mid-1;
		            }
		            
		        }
		        System.out.println(ans);
		    }
		}
	}
}	
	