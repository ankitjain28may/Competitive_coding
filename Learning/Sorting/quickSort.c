#include<stdio.h>

// Partition function for arranging elements greater than pivot to this right side and those lesser than pivot to its left side.
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low-1;
    int j, temp;

    for (j = low; j < high; j++) {

        if (arr[j] < pivot) {

            i++;
            // Swap the elements.
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    // Place pivot element to this correct place.
    temp = arr[i+1];
    arr[i+1] = pivot;
    arr[high] = temp;

    return i+1;

}

// Recursively call the sort method for partitioning the array.
void sort(int arr[], int low, int high) {
    int pi=0;
    if (low < high) {
        pi = partition(arr, low, high);

        sort(arr, low, pi-1);
        sort(arr, pi+1, high);
    }
}


int main(void)
{
    int arr[10];
    int i=0, n;
    // Enter the no. of elemets
    printf("Enter the no. of elements less than 10 for sorting\n");
    scanf("%d", &n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Array before sorting\n");
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    sort(arr, 0, n-1);
    printf("\nArray after sorting\n");
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

}
