//  Srishti and the candies*

// https://www.hackerearth.com/problem/algorithm/srishti-and-the-candies/


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
	int d=a/b;
	int f=d; 
	int x=d/c;
	if(d>=c)
	{
	 f=f+x;
	}
	int e=d%c;
	int y=0;
	if((x+e)>=c)
	{
	 y=(x+e)/c;
	f=f+y;
	} 
  d=(x+e)%c;
  if((y+d)>=c)
  {
  	f=f+d;
  }
        System.out.println(f);
    
    t--;
}
}
}
