import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Katas {

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
       // System.out.println(Arrays.toString(twoSum(nums, target)));
        //System.out.println("my" + solution( 1041 ));
        int[] s = {1,2,3,4};
        System.out.println(Arrays.toString(shift(s, 4)));

    }

    public static int solution(int N) {
        String toBin = Integer.toBinaryString(N);
        System.out.println(toBin);

        ArrayList<Integer> zCounts = new ArrayList<Integer>();
        int count = 0;
        int index = 0;
        for (int i = 0; i < toBin.length(); i++) {
            if (toBin.charAt(i) == '1') {
                zCounts.add(index, count);
                index++;
                count = 0;
            }
            if (toBin.charAt(i) == '0') {
                count++;
            }
        }

        Collections.sort(zCounts, Collections.reverseOrder());
        if (zCounts.get(0) == 0) {
            return -1;
        }
        zCounts.removeAll(Collections.singletonList(0));
         return zCounts.get(0);
    }

    public static int[] shift(int[] A, int K) {
        int[] B = new int[A.length];
        System.out.println("A = " + Arrays.toString(A) + "size of B "+ B.length);
        int j = 0;
        //first lets check if all of the values are the same
        //if so just return the array
        Set<Integer> valsSet = new HashSet<Integer>();
        for (int i: A) {
            valsSet.add(i);
        }
        if (valsSet.size() == 1) {
            System.out.println("set val " + valsSet);
            return A;
        } else { //if the array values are not all the same then shift
            for (int i = 0; i < A.length; i++) { //loop thru array
                System.out.println("i+K = " + (i + K));
                System.out.println("i = " + i);

                if (i+K >= A.length) {
                    //this needs to be set when the array index is oob
                    j = j*1;
                    B[j] = A[i];
                    j ++;
                    System.out.println("B = " + Arrays.toString(B) + " and j = " +j );
                } else {
                    B[i+K] = A[i];
                    System.out.println("B = " + Arrays.toString(B));
                }


            }
            return B;
        }
    }

    public static int[] twoSum1(int[] nums, int target) {
        System.out.println("nums = " + Arrays.toString(nums) + ", target = " + target);
        //first see if there are values that are equal to or great than the target
        //doing this in order to make sure we do not use these numbers
        int length = nums.length;
        while (length >= 2) {
            for (int i = 0; i <= length; i++) {
                for (int j = 1; j <= length-1; j++){
                    System.out.println("i = " + i + " j = " + (j));
                    int sum = nums[i] + nums[j];
                    System.out.println("nums = " + nums[i] + " " + nums[j]);
                    if (sum == target) {
                        int[] ind = new int[]{i, j};
                        return ind;
                    }
                }
            }
        } return nums;
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        while (length >= 2) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            System.out.println("map1 = " + map);
            for (int i = 0; i < nums.length; i++) {
                System.out.println("contains = " + map.containsKey(nums[i]));
                if (map.containsKey(nums[i])) {
                    System.out.println("map get = " + map.get(nums[i]));
                    return new int[]{map.get(nums[i]), i};
                } else {
                    map.put(target - nums[i], i);
                }
            }
        }return new int[]{0, 0};
    }

}
