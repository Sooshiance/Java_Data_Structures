public class Array_Main
{
    // Representing
    static void showArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]);
    }
    
    // Searching
    static int findElement(int arr[], int n, int key)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }

    // Appending
    static int insertSorted(int arr[], int n, int key, int capacity)
    {
        if (n >= capacity)
            return n;

        arr[n] = key;

        return (n + 1);
    }

    // Inserting an element at any position
    static void insertElement(int arr[], int n, int x, int pos)
    {
        for (int i = n - 1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = x;
    }

    public static void main(String args[])
    {
        int sorted_array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        
        int unsorted_array[] = { 6, 14, 23, -10, 5, 0, -19, 25 };
        
        showArray(sorted_array);

        showArray(unsorted_array);
    }
}