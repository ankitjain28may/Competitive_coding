// Addition of Two Numbers
// http://www.practice.geeksforgeeks.org/problem-page.php?pid=275

#include <stdio.h>
int main()
{
	int t=0,a=0,b=0;
	scanf("%d",&t);
	while(t!=0)
	{
		scanf("%d %d",&a,&b);
		a=a+b;
		printf("%d\n",a);
		t--;
	}
	return 0;
}