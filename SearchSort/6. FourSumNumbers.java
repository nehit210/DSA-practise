import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        int size=arr.length;
        int l,r;
        for(int i=0;i<size-3;i++)
        {
            for(int j=i+1;j<size-2;j++)
            {
                l=j+1;
                r=size-1;
                while(l<r)
                {
                    ArrayList<Integer> quad=new ArrayList<>();
                    if(arr[i]+arr[j]+arr[l]+arr[r]==k)
                    {
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[l]);
                        quad.add(arr[r]);
                        list.add(quad);
                        l++;
                        r--;
                        while(l<r&&arr[l]==quad.get(2))
                            l++;
                        while(l<r&&arr[r]==quad.get(3))
                            r--;
                    }
                    else
                    if(arr[i]+arr[j]+arr[l]+arr[r]<k)
                    l++;
                    else
                    r--;
                }
            while(j<size-1 && arr[j+1]==arr[j])
                    j++;
            }
            while(i<size-2 && arr[i+1]==arr[i])
                    i++;
        }            
        // code here
        return list;
    }
}