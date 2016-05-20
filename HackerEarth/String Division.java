// String Division*

// https://www.hackerearth.com/problem/algorithm/string-division/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
        	String st=s.next();
        	int l=st.length();
            int p=l/4;
            int flag=0;
            for(int i=0;i<l-p;i++)
            { int c=0;
            flag=0;
            	char ch=st.charAt(i);
            	
            	for(int j=i+1;j<=i+p;j++)
            	{
            		if(st.charAt(j)==ch)  
                    c++;
            	}
            	if(c>=p)
            	{
            	 flag=1; 
            	 break;
            	}
            	
            }
            if(flag==1)
            System.out.println("NO");
            else
            System.out.println("YES");
            t--;
        }
    }
    
        }