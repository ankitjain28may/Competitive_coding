// Karan's Teacher*

// https://www.hackerearth.com/problem/algorithm/karans-teacher/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{    int i=0,flag=0;
	int p=s.nextInt();
    for( i=0; i<=1016; i++)
    {
    	int r=i;
    	long st=1;
    	while(r!=0)
    	{
    		st=st*r;
    		r--;
    	}
    	double c=Math.pow(10,p);
    	if(st%c==0)
    	{
    	flag=1;
    	break;
    	}
    }
  if(flag==1)
        System.out.println(i);
        else
        System.out.println(i+1);
       t--; 
}
    }
}
