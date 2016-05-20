// Tom and Coins

// https://www.hackerearth.com/problem/algorithm/tom-and-coins/


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
	int sum=a;
	for(int i=1;i<c;i++)
	sum=sum+b;
        System.out.println(sum);
        t--;
}
    }
}
