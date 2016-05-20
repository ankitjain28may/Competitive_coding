// Organize Contest

// https://www.hackerearth.com/problem/algorithm/organize-contest/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String st[]=new String[t];
        int a[]=new int[t];
        int score[]=new int[t];
        String name[]=new String[t];
        int max=-100;
        String na="";
        int m=0;
        for(int i=0;i<t;i++)
        {
        	st[i]=s.next();
        	a[i]=s.nextInt();
        }
        for(int i=0;i<t-1;i++)
        {
        		if(st[i].equals(" "));
        		else
        		{
        			name[m]=st[i];
        			score[m]=a[i];
        		for(int j=i+1;j<t;j++)
        		{
        		if(st[i].equals(st[j]))
        		{
        			score[m]=score[m]+a[j];
        			st[j]=" ";
        		}
        		}
        		m++;
        		}
        		for(int k=0;k<m;k++)
        		{
        			if(score[k]>max)
        			{
        				max=score[k];
        				na=name[k];
        			}
        		}
        	}
        
        System.out.println(na);
    }
}
