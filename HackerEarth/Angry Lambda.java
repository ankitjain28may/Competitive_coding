// Angry Lambda

// https://www.hackerearth.com/problem/algorithm/angry-lambda/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {   int c=0;
        	int n=s.nextInt();
        	int k=s.nextInt();
        	for(int i=0;i<n;i++)
        	{
        	if(s.nextInt()<=0)
        	c++;
        	}
        	if(c>=k)
        	System.out.println("NO");
        	else
        	System.out.println("YES");
       t--;
        }
    }
}
