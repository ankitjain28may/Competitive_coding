// Bubble Sort

// https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/tutorial/
#include <stdio.h>

int main()
{
   int a[100], n,i,s=0,j,t;
   scanf("%d",&n);
   for(i=0;i<n;i++)
   {
    scanf("%d",&a[i]);
   }
   for(i=0;i<n-1;i++)
   {
    for(j=0;j<n-i-1;j++)
    {
        if(a[j] > a[j+1])
        {
            s++;
            t = a[j];
            a[j] = a[j+1];
            a[j+1] = t;
        }
    }
   }
   printf("%d",s);
}
