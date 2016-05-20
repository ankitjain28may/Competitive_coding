 // Milly and Chocolates

 // https://www.hackerearth.com/problem/algorithm/milly-and-chocolates-4/



import java.util.*;
import java.text.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=s.nextInt();
	double d=0;
	for(int i=0;i<n;i++)
	d=d+a[i];
	int l=(int)d/n;
	String sp=Integer.toString(l);
	l=sp.length();
	if(l==2)
	sp="#00.00000000";
	else
	sp="#0.00000000";
	DecimalFormat df=new DecimalFormat(sp);
String st=df.format(d/n);
        System.out.println(st);
        t--;
}
    }
}
