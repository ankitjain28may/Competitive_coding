//  IndiaHacks Servers

// https://www.hackerearth.com/problem/algorithm/indiahacks-servers/

/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) {
      
      Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       while(n!=0)
       {int c=0,y=0,p=0;
       	int l=s.nextInt();
       	int a[]=new int[l];
       	for(int i=0;i<l;i++)
       	a[i]=s.nextInt();
       for(int i=0;i<l;i++)
       {
       	if(a[i]>0)
       	{
       		p=a[i];
       		while(p!=0)
       		{
       			if(a[p+i]>0)
       			
       		}
       	}
      else if(a[i]==(-1))   
      {
      c=c+1-p;
      p=0;
       }
       }
     
        System.out.println(c);
        n--;
       }
    }
}

