class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
        int len = a1.length+a2.length;
        int n = len/2;
        int i = 0, j = 0, k = 0;
        int n1 = a1.length;
        int n2 = a2.length;
        int a3[] = new int[len];
        
        while (i<n1 && j <n2) 
        {  
            if (a1[i] < a2[j]) 
            {
                a3[k++] = a1[i++]; 
            }    
            else
            {
                arr3[k++] = nums2[j++]; 
            }    
        }
        while (i < n1)
        {
            a3[k++] = a1[i++]; 
        }    
        while (j < n2)
        {
            a3[k++] = a2[j++]; 
        }    
        if(n1==0){
            if(n2%2==0){
                return (double)(a2[(n2/2)-1]+a2[n2/2])/2;
            }else{
                return a2[n2/2];
            }
        }else if(n2==0){
            if(n1%2==0){
                return (double)(a1[(n1/2)-1]+a1[n1/2])/2;
            }else{
                return a1[n1/2];
            }
        }
        if(len%2==0){
            return (double)(a3[n-1]+a3[n])/2;
        }else{
            return (a3[n]);
        }
    }
}    