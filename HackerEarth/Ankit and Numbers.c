// https://www.hackerearth.com/problem/algorithm/ankit-and-numbers-8/

#include <stdio.h>
#include <math.h>
int main()
{  
	int n=0;
   scanf("%d",&n); 
   while(n!=0)
   {
   	int a=0;
   	scanf("%d",&a);
   	long sum=(a*(a+1))/2*(pow(2,a-1)); 
   	
   	printf("%ld",sum);
   	n--;
   }
    return 0;
}