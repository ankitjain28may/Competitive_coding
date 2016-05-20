// Artsy Lulu

// https://www.hackerearth.com/problem/algorithm/artsy-lulu-1/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        char z='z';
        while(s.hasNext())
        {
        	String st=s.next();
        	char ch=st.charAt(0);
        	int h=s.nextInt();
        	if(h<2 || ((z-ch+1)<h))
        	System.out.println("INVALID");
        	else
        	{
        		for(int j=0;j<h;j++)
        		{
        			char p=(char)(ch+j);
        		for(int i=0;i<=j;i++)
        		{
        			System.out.print(p+" ");
        		}
        		System.out.println();
        	}
        	
        }
        System.out.println();
        }
    }
}
