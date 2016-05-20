 // Tom and Jerry with Numbers!

 // https://www.hackerearth.com/problem/algorithm/tom-and-jerry-with-numbers-4/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
    long n=s.nextLong();
	long x=s.nextLong();
	long y=s.nextLong(); 
	int p=1;
	int c=5;
	while(n!=0)
	{   
		
	  if(x<=n && )
	  {
	  	n=n-x; 
	  	c=1;
	  } 
	  p++;
	  if(y<=n)
	  {
	  	n=n-y;
	  	c=0;
	  } 
	  p++;
	}
        t--;
        System.out.println(c);
    }
    }
}
