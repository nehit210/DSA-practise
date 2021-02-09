import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Isomorphic obj = new Isomorphic();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends


class Isomorphic{
    // This function returns true if str1 and str2 are ismorphic
    // else returns false
    public static boolean areIsomorphic(String str1,String str2)
    {
        int m=str1.length();
        int n=str2.length();
        if(m!=n)
        {
            return false;
        }
        int ch1[]=new int[128];
        int ch2[]=new int[128];
        for(int i=0;i<m;i++)
        {
            if(ch1[(int)str1.charAt(i)]!=ch2[(int)str2.charAt(i)])
            {
                return false;
            }
            else
            ch1[(int)str1.charAt(i)]++;
            ch2[(int)str2.charAt(i)]++;
            
        }
        return true;// Your code here
        
    }
}