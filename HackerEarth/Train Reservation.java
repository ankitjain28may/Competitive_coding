// Train Reservation

// https://www.hackerearth.com/problem/algorithm/train-reservation/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
    String st="";
	int n=s.nextInt();
	int a=n%8;
	if(a==0)
	st="Side Upper";
	else if(a==1 || a==4)
	st="Lower";
	else if(a==2 || a==5)
	st="Middle";
	else if(a==3 || a==6)
	st="Upper";
	else
	st="Side Lower";
	t--;
        System.out.println(st);
    }
}
}