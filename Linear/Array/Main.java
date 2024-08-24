package Array;

public class Main
{
    public static void main(String args[])
    {
        // Defining Arrays : 
        // sorted
        int[] sort = new int[20];
        // unsorted
        int[] unsort = new int[20];

        Unsorted.showArray(unsort, 10);
        System.out.println(Unsorted.findElement(unsort, 10, 41));
        System.out.println(Unsorted.insertSorted(unsort, 10, 34, 10));
        Unsorted.insertElement(unsort, 10, 23, 10);
        System.out.println(Unsorted.deleteElement(unsort, 10, 60));
    }
}