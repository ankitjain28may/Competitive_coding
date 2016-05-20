// Strings Matching

// https://www.hackerearth.com/problem/algorithm/matching-strings-8/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       while(n!=0) 
       {
       	String s1 = s.next();
       	String s2= s.next();
       	int l1=s1.length();
       	int l2=s2.length();
       	char ch1[]= new char[l1];
       	char ch2[]= new char[l2]; 
       	int p=0,c=0;
       	for(int i=0; i<l1; i++)
       	ch1[i]=s1.charAt(i);
       	for(int i=0;i<l2;i++)
       	ch2[i]=s2.charAt(i);
       	if(l1>l2)
       	p=l2;
       	else if(l2>l1)
       	p=l1;                              
       	else
       	p=l1;   
       	for(int i=0; i<p; i++)
       	       		if(ch1[i]==ch2[i])
       		c++;
       	
       	System.out.println(c);
       	n--;
       }
    }
}