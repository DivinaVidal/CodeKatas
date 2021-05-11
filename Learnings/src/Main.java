import java.util.*;
//everything that needs to be run needs to be inside a class, this one is inside Main
//public class means any other class can access it
public class Main {
    //public - can be accessed by any other class
    //static - this method can be run without creating an instance of Main
    //void - this method does not return a value
    public static void main(String[] args) {
        /*basic variables called primitives
         [byte-1 byte, short-2 bytes, int-4 bytes,
         long-8 bytes, float-4 bytes, double-8 bytes, char-2 bytes, boolean-1 byte]*/
        int myAge;
        //Strings are not primitive, they are real types
        String myName;
        String myInfo;

        //if else statements can be written like below
        int a = 4;
        int result = a == 4 ? 1 : 8;
        //same as
        int result1;

        if (a == 4) {
            result1 = 1;
        } else {
            result1 = 8;
        }
//beginning of objects
        // == and equals
        /*
            == works different on objects than primitives
            == will say if they are the same
            using equals() will check if they are logically the same
         */
        String a1 = new String("Wow");
        String b = new String("Wow");
        String sameA = a1;

        boolean r1 = a1 == b;      // This is false, since a and b are not the same object
        boolean r2 = a1.equals(b); // This is true, since a and b are logically equals
        boolean r3 = a1 == sameA;  // This is true, since a and sameA are really the same object

        //arrays
        int[] arr; //declare first
        arr = new int[]{1, 2, 3, 4, 5, 6}; //then create it
        System.out.println("Creating an array of length: " + arr.length);
        //to print the array you have to loop through it
        //i is the index of the array
        //start at index 0
        for (int i = 0; i < arr.length; i++) {
            //print the array from beginning to end
            System.out.println(arr[i]);
        }
        //for loop to print backwards
        for (int i = 5; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        //while loop
        int i = 0;
        //while the array index does not equal the array length print Hello and the number
        while (arr[i] != arr.length) {
            System.out.println("Hello " + arr[i]);
            i++;
        }
        //do while loops are for when you want the while loop to run at least once
        do {
            //this will run only once because i is already equal to the array length from the previous while
            System.out.println("Well, I ran once for " + arr[i]);
        } while (arr[i] != arr.length);
        //break and continue help control the loop fro within
        //breaks will make the loop stop and continue to the next set of code
        int n;
        for (n = 0; n < 5; n++) {
            if (n >= 2) {
                break;
            }
            System.out.println("Break did not happened");
        }
        System.out.println(n);
        //print arguments
        for (int y = 0; y <args.length; y++) {
            System.out.println(args[y]);
        }
    }
    //non static methods are used more than static
    //non static can access and alter the field of the object
    //everything in Java is within classes and objects
    //objects hold a state, state are variables which are saved together within an object (fields or member vriables
    class Point {
        int x;
        int y;
        //define your own constructor
        Point(int x, int y) {
            this.x = x; //"this" keyword can be used within a constructor to call a different constructor to avoid code duplication
            this.y = y; //"this" keyword can also be used as a reference of the current object we are running on
        }
        public Point() {
            this(0,0);
        }
    }
    //in order to create an instance of Point class use "new"
    Point p = new Point(3, 6);
    /*Inheritance vs Interface
    Inheritance is the adoption of all non-private properties and methods of one class (superclass)
    by another class (subclass), it is a way to make a copy of an existing class as the starting point for another,
    also called derived classes.
    Interfaces define ony the structure of teh class members while inherited classes include the actual code of the superclass.
    Inheritance uses the keyword extends.
    To execute the inherited code from within the subclass the method must include the "super" prefix.
    ex super.methodName()
    Inheritance promotes code reuse and the concept of generic-to-specific implementation.
    Superclasses will be written at the most generic level, subclasses can be created from superclass with a finer more specific purpose.
     */
    //Inheritance example: Door
    //Superclass = Door subclass = BankVaultDoor
    /*
    public class Door {
        public void open ()
        {
            push;
        }
    }
    class BankVaultDoor extends Door {
        public void open () {
            enterCombination();
            pull;
        }
    }
     */
    /*
        Abstract classes contain one or more abstract methods.
        Abstract methods are declared but not implemented.
        Abstract classes cant be instantiated but can be inherited by other classes.
        The inheriting class must implement all abstract methods or else the subclass also be declared as abstract.
     */
    //Interfaces are like abstract classes however, they are like a skeleton like a template
    //The code gets created when implemented by another class (Polymorphism)
}

