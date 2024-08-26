package Array;

public class Sorted
{
    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
  
        /*low + (high - low)/2;*/
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    static int insertSorted(int arr[], int n, int key, int capacity) 
    {
        // Cannot insert more elements if n is already
        // more than or equal to capacity
        if (n >= capacity)
            return n;
  
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
            arr[i + 1] = arr[i];
  
        arr[i + 1] = key;
  
        return (n + 1);
    }

    static int deleteElement(int arr[], int n, int key)
    {
        // Find position of element to be deleted
        int pos = binarySearch(arr, 0, n - 1, key);
  
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
  
        // Deleting element 
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
  
        return n - 1;
    }
}