// Ravi's Trouble

// https://www.hackerearth.com/problem/algorithm/ravis-trouble-3/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
        	String st=s.next();
        	String ss=s.next();
        	int l=st.length();
        	
        	char a[]=new char[l];
        	for(int i=0;i<l;i++)
        	a[i]=st.charAt(i);
        	int flag=0;
        	int i=0;
        	for(int j=0;j<ss.length();j++)
        	{
        		flag=0;
        	for(i=i;i<l;i++)
        	{
        		if(a[i]==ss.charAt(j))
        		{
        			flag=1;
        			a[i]=' ';
        			break;
        		}
        	}
        	if(flag==0)
        	break;
        }
        if(flag==0)
        System.out.println("NO");
        else
        System.out.println("YES");
        t--;
        }
    }
}
