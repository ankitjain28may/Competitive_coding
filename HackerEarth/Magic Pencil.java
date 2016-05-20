// Magic Pencil

// https://www.hackerearth.com/problem/algorithm/problem-1-39/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
    int a=s.nextInt();  
    int b=s.nextInt();
	int c=s.nextInt();
	int d=(int)Math.pow(a,b); 
	int sum=0,ss=0;
 
     sum=(d/c)*c;
	  ss=((d/c)+1)*c;
	  if(ss-d>=d-sum)
        System.out.println(sum);
        else
        System.out.println(ss);
	
        t--;
}
    }
}