// HANUMAN LANGUAGE

// https://www.hackerearth.com/problem/algorithm/hanuman-language/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>=0)
        {
        	String st=s.nextLine()+" ";
        	int l=st.length();
        	int p=0,m=0;
        	String sp[]=new String[l];
        	for(int i=0;i<l;i++)
        	{
        		char ch=st.charAt(i);
        		if(ch==' ')
        		{
        			sp[m]=st.substring(p,i);
        			m++;
        			p=i+1;
        		}
        	}
        	for(int i=m-1;i>=0;i--)
        	System.out.print(sp[i]+" ");
        	System.out.println();
       t--;
        }
    }
}
