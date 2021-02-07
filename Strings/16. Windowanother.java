import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new solve().smallestWindow(s, t));
		    test--;
		}
	}
}// } Driver Code Ends


class solve
{
    // return the smallest window in S with all the characters of P
    // if no such window exists, return "-1" 
    public static String smallestWindow(String S, String P){
        int l1 = P.length();
        int l2 = S.length();
        int c1=0;
        int ch[] = new int[256];
        String sub = "";
        int min = Integer.MAX_VALUE;
        int i=0,j=0;
        for(char c : P.toCharArray()){
            ch[(int)c]++;
        }
        
        char sarray[] = S.toCharArray();
        while(i<=j&&j<l2){
            if(c1<l1){
                if(--ch[(int)sarray[j]]>=0){
                    c1++;
                }
                j++;
            }else{
                if(min> j-i){
                    min = j-i;
                    sub = S.substring(i,j);
                }
                if(++ch[(int)sarray[i]]>0){
                    c1--;
                }
                i++;
            }
        }
        while(c1==l1){
            if(min> j-i){
                min = j-i;
                sub = S.substring(i,j);
            }
            if(++ch[(int)sarray[i]]>0){
                c1--;
            }
            i++;
        }
        return (sub.length()==0)?"-1":sub;
    }
}