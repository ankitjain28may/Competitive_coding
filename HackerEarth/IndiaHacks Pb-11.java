// IndiaHacks Pb-1

// https://www.hackerearth.com/problem/algorithm/indiahacks-pb-2/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String a[]=new String[t];
        int i=0;
        for(i=0;i<t;i++)
        a[i]=s.next();
        int flag=0;
        for(i=0;i<t-1;i++)
        { 
        	String st="";
          int l=a[i].length();
          for(int k=l-1;k>=0;k--)
          st=st+a[i].charAt(k);
        	for(int j=i+1;j<l;j++)
        	{
        		if(st.equals(a[j]))
        		{
        			flag=i;
        			break;
        		}
        	}
        	if(flag!=0)
        	break;
        }
        	int p=a[i].length();
        	char ch=a[i].charAt((p-1)/2);
        System.out.println( p + " " + ch );
        
    }
}
