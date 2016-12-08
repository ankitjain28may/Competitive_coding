// Turbo Sort
// https://www.codechef.com/problems/TSORT

#include <stdio.h>
#include <math.h>

void merge(int left[], int right[], int A[], int nl, int nr)
{
    int i=0,j=0,k=0;
    while(i < nl && j < nr)
    {
        if(left[i] < right[j])
        {
            A[k] = left[i];
            k = k+1;
            i = i+1;
        }
        else
        {
            A[k] = right[j];
            k = k+1;
            j = j+1;
        }
    }
    while(i < nl)
    {
        A[k] = left[i];
        i+=1;
        k+=1;
    }
    while(j < nr)
    {
        A[k] = right[j];
        j+=1;
        k+=1;
    }
}

int mergeSort(int A[],int n)
{
    int i=0;
    int m = n/2;
    int left[m],right[n-m];
    if(n<2)
    {
        return;
    }
    for(i=0;i<m;i++)
    {
        left[i] = A[i];
    }
    for(i=m;i<n;i++)
    {
        right[i-m] = A[i];
    }
    mergeSort(left,m);
    mergeSort(right,n-m);
    merge(left, right, A, m, n-m);
    return 0;
}

int main() {
    int a[10000000];
    int i=0,m=0;
    int l;
    scanf("%d",&l);
    for(i=0;i<l;i++)
        scanf("%d",&a[i]);
    mergeSort(a,l);
    for(i=0;i<l;i++)
        printf("%d\n",a[i]);
    return 0;
}