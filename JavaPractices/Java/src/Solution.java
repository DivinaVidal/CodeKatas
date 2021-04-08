import java.io.*;
import java.util.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        //System.out.println("arr = " + Arrays.deepToString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            //System.out.println("arr i = " + i);
            for(int j = 0 ; j < arr.length; j++){
                //System.out.println("arr j= " + j);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length; ++j) {
                if (j + 2 < 6 && i + 2 < 6) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                            arr[i + 1][j + 1] +
                            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    System.out.println("sum = " + sum);
                    if (sum >= maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }


        //while(arr.length)



    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = {{1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}};
        int[][] arr1 = {{-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};

        /*for (int i = 0; i < 6; i++) {
            //String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int[] arrItem = arr[j];
                arr[i][j] = arrItem;
            }
        }*/

        int resultArr = hourglassSum(arr);
        System.out.println("result  " + resultArr);
        int result2 = hourglassSum(arr1);
        System.out.println("2nd result = " + result2);

      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

       // scanner.close();
    }
}