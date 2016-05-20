// Paula Distance Problem

// https://www.hackerearth.com/problem/algorithm/paula-distance-problem/




import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{ int c=0;
	String a=s.next();
	String b=s.next();
	int la=a.length();
	int lb=b.length();
	if(la!=lb)
	c=-1;
	else
	{
		for(int i=0;i<la;i++)
		{
			if(a.charAt(i)!=b.charAt(i))
			c++;
		}
	}
        System.out.println(c); 
        n--;
}
    }
}
