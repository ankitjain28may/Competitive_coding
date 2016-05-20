// Chandu and Consecutive Letters

// https://www.hackerearth.com/problem/algorithm/chandu-and-consecutive-letters/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
	String a=s.next();
	a=a+" ";
	int l=a.length();
	String st="";
	for(int i=0;i<l-1;i++)
{
	char ch=a.charAt(i);
	if(ch!=a.charAt(i+1))
	{
		st=st+ch;
	}
}

        System.out.println(st);
        n--;
}
    }
}
