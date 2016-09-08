// Leap Year
// http://www.practice.geeksforgeeks.org/problem-page.php?pid=203

#include <stdio.h>

int main() {
	int t=0,n=0;
	scanf("%d",&t);
	while(t!=0)
	{
	    scanf("%d",&n);
	    if(n%400==0 || (n%4==0 && n%100!=0) )
	    printf("Yes\n");
	    else
	    printf("No\n");
	    t--;
	    
	}
	return 0;
}