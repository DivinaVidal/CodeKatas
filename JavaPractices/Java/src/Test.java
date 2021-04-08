import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*String str = "hellllllloooo";
        System.out.println(clever(str));
        String str1 = "hi";
        System.out.println(clever(str1));
        String str2 = "what_da-heck*you";
        System.out.println(clever2(str2));*/
        /*int num = 1234;
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
        System.out.println(palindrome("Bob"));*/
        removeDuplicates();
        Passenger passenger1 = new Passenger();
        passenger1.setName("Po");
        System.out.println(passenger1);

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
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

    public static int fibonacci() {
        int num [] = new int[7];


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
        int num[] = {0};
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
            //System.out.println("c = " + c);
            String ch = String.valueOf(c).toString();
            String chars = "";
            System.out.println(!chars.contains(ch));
            if (!chars.contains(ch)) {
                chars = String.valueOf(c);
                //System.out.print(chars);
            //    System.out.print(chars[i]);
            }
        }
        return "";
    }

    public static String removeDuplicates() {
        String string = "mississippi";
        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
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
