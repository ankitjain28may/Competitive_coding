// Barbie's Typography

// https://www.hackerearth.com/problem/algorithm/barbies-typography-3/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        while(s.hasNext())
        {   
        	String st=s.nextLine();
        	st=st+" ";
        	int l=st.length();
        	String ss[]=new String[l];
        	int x=0,len=0;
        	String y="";
        	for(int j=0;j<l;j++)
        	{
        		char ch=st.charAt(j);
        		if(ch==' ')
              {
              	ss[x]=y;
          
           if(y.length()>len)
           len=y.length();
            x++;
            y="";
              }
              else
              y=y+ch;
        }
        for(int j=0;j<len;j++)
        {
        for(int i=0;i<x;i++)
        {
        if(ss[i].length()<j+1)
        System.out.print("  ");
        else
        System.out.print(ss[i].charAt(j)+" ");
        }
                System.out.println();
        }
      

        }
    }
}
