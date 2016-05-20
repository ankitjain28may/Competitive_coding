 // G - Game with Letters*

 // https://www.hackerearth.com/problem/algorithm/g-game-with-letters/

 import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
        	int n=s.nextInt();
        	String st=s.next();
        	String g[]=new String[n];
        	for(int i=0;i<n;i++)
        	g[i]=s.next();
        	int sum=0;
        	int x=0,max=0,y=0;
        	for(int i=0;i<n;i++)
        	{
        		sum=0;
        		for(int j=0;j<g[i].length();j++)
        		{
        			int c=0;
        			char ch=g[i].charAt(j);
        			for(int k=0;k<st.length();k++)
        			{
        				char ch1=st.charAt(k);
        				if(ch==ch1)
        				c++;
        			}
        			sum=sum+c;
        		}
        		if(sum>max)
        		{
        		max=sum;
        		x=i;
        		y=g[i].length();
        		}
        		else if(sum==max && g[i].length()<y)
        		{
        			max=sum;
        		x=i;
        		y=g[i].length();
        		}
        	}
        t--;
        System.out.println(x+1);
        }
    }
}