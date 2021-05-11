import java.util.Arrays;

public class Algorithms {
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            System.out.println("m = " + m + " r = " + r + " l = " + l);

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x) {
                System.out.println("x is greater so ignoring left ");
                l = m + 1;
            } else {// If x is smaller, ignore right half
                System.out.println("x is smaller than value at arr[m] so ignoring right ");
                r = m - 1;
            }
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String args[])
    {
        Algorithms ob = new Algorithms();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
