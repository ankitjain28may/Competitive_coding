// Wonderful Sequence

// https://www.hackerearth.com/problem/algorithm/wonderful-sequence-3/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{ int c=0;
	int a=s.nextInt();
	long b[]=new long [(int)a];
	for(int i=0;i<a;i++)
	b[i]=s.nextLong();
	for(int i=0;i<a-1;i++)
	{
		if(b[i]>b[i+1])
		c++;
	} 
        System.out.println(c); 
        n--;
}
    }
}
