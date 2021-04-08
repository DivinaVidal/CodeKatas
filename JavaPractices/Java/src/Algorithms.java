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
        /*Algorithms ob = new Algorithms();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);*/

        char[] a = new char[] {'n','s','n','s','n','s','n','s','n','s'};
        System.out.println(isValid(a));
        char[] b = new char[] {'w'};
        System.out.println(isValid(b));
        char[] c = new char[] {'n','n','s','n','s','n','w','n','s','n'};
        System.out.println(isValid(c));
        char[] d = new char[] {'e','e','s','n','n','n','s','n','s','w'};
        System.out.println("d = " + isValid(d));
    }

    public static boolean isValid(char[] walk) {
        int start = 0, n = 0, w = 0, track = 0;
        if (walk.length != 10) {
            return false;
        }
        for (int a = 0; a < walk.length; a++) {
            start++;
            //System.out.println("start = " + start + " walk a = " + walk[a]);
            switch (walk[a]) {
                case 'n':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'w':
                    w++;
                    break;
                case 'e':
                    w--;
                    break;
            }
        }
        if ( n != 0 && w != 0) {
            return false;
        }
        System.out.println("n = " + n + " w = " + w );
        track = n + w;
        System.out.println("track = " + track);

        if (start == 10 && track == 0) {
            return true;
        } else {
            return false;
        }
    }
}
