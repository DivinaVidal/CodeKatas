import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Katas {

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println("my " + solution( 1041 ));
        int[] s = {1,2,3,4};
        System.out.println(Arrays.toString(shift(s, 4)));
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
        int resultArr = hourglassSum(arr);
        System.out.println("result  " + resultArr);
        int result2 = hourglassSum(arr1);
        System.out.println("2nd result = " + result2);
        char[] a = new char[] {'n','s','n','s','n','s','n','s','n','s'};
        System.out.println(isValidWalk(a));
        char[] b = new char[] {'w'};
        System.out.println(isValidWalk(b));
        char[] c = new char[] {'n','n','s','n','s','n','w','n','s','n'};
        System.out.println(isValidWalk(c));
        char[] d = new char[] {'e','e','s','n','n','n','s','n','s','w'};
        System.out.println("d = " + isValidWalk(d));
        String str = "hellllllloooo";
        System.out.println(clever(str));
        String str1 = "hi";
        System.out.println(clever(str1));
        String str2 = "what_da-heck*you";
        System.out.println(clever2(str2));
        int num = 1234;
        System.out.println(squareDigits2(num));
        System.out.println(whoLikesIt2());
        String l[] = {"Peter"};
        System.out.println(whoLikesIt2(l));
        String likes[] = {"Peter", "Teresa"};
        System.out.println(whoLikesIt2(likes));
        String likes3[] = {"Peter", "Teresa", "Yo", "tr"};
        System.out.println(whoLikesIt2(likes3));
        String likes1[] = {"Peter", "Teresa", "Joe", "Pat", "Tad"};
        System.out.println(whoLikesIt2(likes1));
        System.out.println(prime(3));
        System.out.println(prime(1));
        System.out.println(prime(4));
        System.out.println(palindrome("Bob"));
        removeDuplicates();
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
        System.out.println("arraylist = " + zCounts);
        Collections.sort(zCounts, Collections.reverseOrder());
        System.out.println("arraylist = " + zCounts);
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
        } else {  //if the array values are not all the same then shift
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

    public static boolean isValidWalk(char[] walk) {
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

    public static String maskify(String str) {
        System.out.println(str.length());
        if (str.length() > 4) {
            int maxStr = str.length() - 4;
            System.out.println(maxStr);
            StringBuilder newStr = new StringBuilder(maxStr);
            for (int i = 0; i < maxStr; i++) {
                newStr.append('*');
            }
            return newStr.toString() + str.substring(0 + maxStr);
        } else if (str.length() == 4) {
            return str;
        } else if (str.length() == 0) {
            return "";
        }
        return str;
    }

    public static String clever(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }

    public static String clever2(String str) {
        String regex = "[!@#$%^&*(),.?\":{}|<>_-]";
        System.out.println("str = " + str);
        StringBuilder newStr = new StringBuilder();
        Boolean cap = false;
        for (int i = 0; i < str.length(); i++) {
            System.out.println("i = " + i);

            if (!String.valueOf(str.charAt(i)).matches(regex)) {
                char temp = str.charAt(i);
                if (cap) temp = Character.toUpperCase(temp);
                newStr.append(temp);
                cap = false;
            } else {
                cap = true;
            }

        } return newStr.toString();

    }

    public static int squareDigits2(int n) {
        int sq = 0;
        String rVal="";

        while (n > 0) {
            int lastDig = n % 10;
            sq = lastDig * lastDig;
            rVal = rVal.concat(String.valueOf(sq));
            n = n/10;

        }
        return Integer.parseInt(rVal);
    }

    public static String whoLikesIt(String... names) {
        String likes = "likes this";
        if (names.length == 0) {
            String none = "no one ";
            return none + likes;
        }

        String nameStr = Arrays.toString(names).replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .replace(",", " and")
                .trim();
        /*String nameStr = Arrays.toString(names);
        nameStr = nameStr.substring(1, nameStr.length() - 1);*/

        if (names.length == 1) {
            return nameStr + " " + likes;
        }
        if ((names.length < 3) && (names.length != 0)) {
            String a = nameStr + " like this";
            return a;
        }

        if (names.length >= 3) {
            StringBuilder firstPart = new StringBuilder();
            StringBuilder lastPart = new StringBuilder();
            int remain = (names.length) - 2;
            for (int i = 0; i < 2; i++) {
                if (i == 0 && names.length == 3) {
                    return String.valueOf(firstPart.append(names[i] + ", " + names[i + 1] + " and " + names[i + 2] + " like this"));
                }
                if (i == 0 && names.length >= 4) {
                    firstPart.append(names[i] + ", " + names[i + 1]);
                }
            }
            if (remain == 1) {
                lastPart.append(" and " + remain + " other like this");
            }
            if (remain > 1) {
                lastPart.append(" and " + remain + " others like this");
            }
            return firstPart.toString() + lastPart;
        }
        return "";
    }

    public static String whoLikesIt2(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        };
    }

    public static int fibonacci() {
        int[] num = new int[7];


        for (int i = 0; i < 8; i++) {
            System.out.println("i = " + i);
            num[i] = i + 1;
            System.out.println("num = " + num[i]);

        }

        return 0;
    }

    public static int fibonacci2(int max){
        if (max == 1 || max == 2) {
            return 1;
        }
        int[] num = {0};
        for (int i = 0; i <= max; i++) {
            num[i] = fibonacci2(max - 1) + fibonacci2(max - 2);
            System.out.println("num = " + num[i]);
            return num[i];
        }
        return 0;
    }

    public static String prime(int x) {

        for (int i = 2; i < x; i ++) {
            int mod = x % i;
            if (mod != 0) {
                return (x + " is a prime");
            } else {
                return (x + " is not a prime");
            }
        }
        return "";
    }

    public static boolean palindrome(String s) {
        s = s.toUpperCase();

        StringBuilder myS = new StringBuilder(s);
        String rev = String.valueOf(myS.reverse());
        System.out.println("s == " + s);
        System.out.println("rev = " + rev);
        if (rev.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static String removeDuplicates1() {
        String s = "mississippi";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String ch = String.valueOf(c).toString();
            String chars = "";
            System.out.println(!chars.contains(ch));
            if (!chars.contains(ch)) {
                chars = String.valueOf(c);
            }
        }
        return "";
    }

    public static String removeDuplicates() {
        String string = "mississippi";
        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
        return "";
    }
}
