import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findsum(arr,n)==true?"Yes":"No");
    }
static boolean findsum(int arr[],int n)
{
    Set<Integer> hs=new HashSet<>();
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
        if(sum==0||arr[i]==0||hs.contains(sum))
        {
            return true;
        }
        hs.add(sum);
    }//Your code here
    return false;
}
}