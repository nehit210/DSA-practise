import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt;
        int k=sc.nextInt;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count= getPairsCount(arr,n,k);
        System.out.println("The count of pairs with given sum are"+ count);
    }
    int getPairsCount(int[] arr, int n, int k) {
         HashMap<Integer, Integer> hm = new HashMap<>();
         int c=0;
        for (int i = 0; i < n; i++) 
        {
            if (!hm.containsKey(arr[i]))
            {
                hm.put(arr[i], 0);
            }    
        hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (hm.get(k - arr[i]) != null)
            {
                c += hm.get(k - arr[i]);
            }    
            if (k - arr[i] == arr[i])
            {
                c--;
            }
        }
        return c/ 2;
    }
 
}