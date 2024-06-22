public class Array_Main
{
    static void showArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]);
    }
    
    static int findElement(int arr[], int n, int key)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }

    public static void main(String args[])
    {
        int sorted_array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        
        int unsorted_array[] = { 6, 14, 23, -10, 5, 0, -19, 25 };
        
        showArray(sorted_array);

        showArray(unsorted_array);
    }
}