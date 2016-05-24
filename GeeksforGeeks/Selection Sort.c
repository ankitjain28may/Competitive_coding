// Selection Sort
// http://www.practice.geeksforgeeks.org/probfunc-page.php?pid=700147


/* The task is to complete select() which is used 
   as shown below to implement selectionSort() */

/* A function to implement selection sort
void selectionSort(int arr[], int n)
{
   int i, j;
   for (i = n-1; i >=0; i--)      
   {
        int j = select(arr, i);
        swap(&arr[i], &arr[j]);
   }
}
 */

int select(int arr[], int i)
{
    int max=i;
    for(int j=i;j>=0;j--)
    {
        if(arr[i]<arr[j] && arr[j]>arr[max])
        {
            max=j;
        }
    }
    return max;
}
