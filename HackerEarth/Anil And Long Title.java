 // Anil And Long Title

 // https://www.hackerearth.com/problem/algorithm/anil-and-long-title-2/

 import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int l=st.length();
        String ss="";
        int i=0;
        if(st.charAt(0)!='_')
        {
        ss=ss+Character.toUpperCase(st.charAt(0));
        }
        
        for(i=1;i<l;i++)
        {
        	char ch=st.charAt(i);
        	if(ch!='_' && st.charAt(i-1)=='_' )
        	{
        		ss=ss+Character.toUpperCase(st.charAt(i));
        	}
        	else
        	ss=ss+ch;
        }
        System.out.println(ss);
    }
}