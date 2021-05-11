package com.my.java;
import java.util.*;

public class InterviewPractice {
    public static void main(String[] args) {
        InterviewPractice ob = new InterviewPractice();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int arr1[] = {64, 34, 25, 12, 22, 11, 90};
        long start = System.currentTimeMillis();
        /*ob.bubbleSort(arr);
        long stop = System.currentTimeMillis() - start;
        System.out.println("Bubble Sorted array ran for " + stop);
        ob.printArray(arr);
        long istart = System.currentTimeMillis();
        ob.insertionSort(arr1);
        long istop = System.currentTimeMillis() - start;
        System.out.println("Insertion Sorted array ran for " + istop);
        ob.printArray(arr1);*/
        ob.mergeSort(arr, arr.length);
        long stop = System.currentTimeMillis() - start;
        System.out.println("Merge Sorted array ran for " + stop);
        ob.printArray(arr);
    }

    /*
    Fibonacci series (solution)
    Write a simple Java program which will print Fibonacci series,
    e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for
    cross questions like using iteration over recursion and how to
    optimize the solution using caching and memoization.

    public static void IterationFibonacci(int max) {
        int n1 = 1, n2 = 1;
        for(int i = 0; i < max; i++) {

        }
    }*/

    /*
     * Bubble sort algorithm
     */
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            System.out.println("i = " + i);

            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("arr = " + Arrays.toString(arr));
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];  //        int arr[] = {64, 34, 25, 12, 22, 11, 90};
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            System.out.println("arr = " + Arrays.toString(arr));
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        //base case
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        System.out.println("l = " + Arrays.toString(l) + ", r = " + Arrays.toString(r));

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
            System.out.println("l = " + Arrays.toString(l) + ", r = " + Arrays.toString(r));
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
            System.out.println("l = " + Arrays.toString(l) + ", r = " + Arrays.toString(r));
        }
        //recursive
        System.out.println("recursive call for left, length = " + mid);
        mergeSort(l, mid);
        System.out.println("recursive call for right, length = " + (n-mid));
        mergeSort(r, n - mid);
        System.out.println("a = " + Arrays.toString(a) + ", l = "
                + Arrays.toString(l) + " r = " + Arrays.toString(r) + " mid = " + mid + " right mid = " + (n-mid));

        merge(a, l, r, mid, n - mid);
        System.out.println("a after sort" + Arrays.toString(a));
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
