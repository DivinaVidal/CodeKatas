public class LeetCode {
    public static void main(String[] args) {

        int[] squareNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            // We need to be careful with the 0-indexing. The next square number
            // is given by (i + 1) * (i + 1).
            // Calculate it and insert it into the Array at index i.
            int square = (i + 1) * (i + 1);
            squareNumbers[i] = square;
        }
        for (int square : squareNumbers) {
            // Print the current value of square.
            //System.out.println(square);
        }

        int c = 0;
        int[] nums;
        nums = new int[]{1,1,0,1,1,1};

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1) {
                for (int j = 0; j < nums.length; j++) {
                    int[]
                }
                c ++;
                System.out.println("Count is :" + c);
            }
        }
        static int getMaxLength(boolean arr[], int n)
        {

            int count = 0; //intitialize count
            int result = 0; //initialize max

            for (int i = 0; i < n; i++)
            {

                // Reset count when 0 is found
                if (arr[i] == false)
                    count = 0;

                    // If 1 is found, increment count
                    // and update result if count becomes
                    // more.
                else
                {
                    count++;//increase count
                    result = Math.max(result, count);
                }
            }

            return result;
        }
    }
}
