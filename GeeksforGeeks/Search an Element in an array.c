// Search an Element in an array
// http://www.practice.geeksforgeeks.org/problem-page.php?pid=77



#include <stdio.h>

int main() {
	int t=0,n=0,e=0,i=0,x=0,flag=0;
	int a[100];
	scanf("%d",&t);
	while(t!=0)
	{
		flag=0;
		scanf("%d",&n);
		for(i=0;i<n;i++)
			scanf("%d",&a[i]);
		scanf("%d",&e);
		for(i=0;i<n;i++)
		{
			if(a[i]==e)
			{
				x=i;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			printf("%d\n",x);
		}
		else
			printf("-1\n");
		t--;
	}

	return 0;
}