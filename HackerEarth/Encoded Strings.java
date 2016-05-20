// Encoded Strings

// https://www.hackerearth.com/problem/algorithm/encoded-strings-3/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s=new Scanner(System.in);
        String st=(s.next()).toUpperCase();
        int l=st.length();
        int sum=0,a=0;
        for(int i=0;i<l;i++)
        {
        	 a=(int)st.charAt(i);
        	a=a-64;
        	sum=sum*10+a;
        }
        if(sum%6==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
