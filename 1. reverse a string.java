class Reverse
{
       //s: input string

public static String reverseWord(String s)
    
{

    char ch[]=s.toCharArray();

    int l,i;

    String str1="";

    l= s.length();
    
    for(i=l-1;i>=0;i--)
      
      {
          
          str1+=ch[i];
 
      }

       return str1;// Reverse the string str
1
}

}
