//  Count Carry Problem

// https://www.hackerearth.com/problem/algorithm/count-carry-problem-6/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{ int c=0;
	long a=s.nextLong();
	long b=s.nextLong();
	long r=a;
	long rr=b;
	if(a>=b) 
	{
	rr=a;
	r=b; 
	}
	while(r!=0)
	{
		long m=r%10;
		long x=rr%10; 
		if(m+x>=10)
		c++;
		r=r/10; 
		rr=rr/10;
	}
	if(rr==9)
	c++;
	if(c==0)
	System.out.println("No carry operation");
	else if(c==1)
	System.out.println(1+" carry operation");
	else
        System.out.println(c+" carry operations");
        n--;
}
    }
}
