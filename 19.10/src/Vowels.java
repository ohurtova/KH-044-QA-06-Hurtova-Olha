// https://www.codewars.com/kata/54ff3102c1bad923760001f3/java

import java.util.*;
import java.util.stream.Collectors;

public class Vowels {

    static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U');
    }

    // Returns count of vowels in str
    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) // Check for vowel
                ++count;
        return count;
    }

    // Driver code
    public static void main(String args[]) {
        //string object
        String str = "abcaopeut de";

        // Total numbers of Vowel
        System.out.println(countVowels(str));
    }
}

//https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/java
public class Main {
    public static void main(String[] args) {
        int number;
        //Place code here
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}

//https://www.codewars.com/kata/52fba66badcd10859f00097e/java
public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}

//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/java
public class Accumul {

    public static String accum(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        String str = "";
        for (int i = 0; i < charArray.length; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (k == 0) {
                    str += Character.toUpperCase(charArray[i]);
                } else {
                    str += charArray[i];
                }
            }
            if (i != charArray.length - 1) {
                str += "-";
            }
        }
        return str;
    }
}

//https://www.codewars.com/kata/546e2562b03326a88e000020/java
public class SquareDigit {

    public int squareDigits(int n) {
        if (n < 10) return n * n;
        else {
            int h = squareDigits(n / 10); //удаляет эту цифру
            int l = n % 10; //берет след цифру слева
            return Integer.parseInt(h + "" + l * l);
        }
    }
}

//https://www.codewars.com/kata/554b4ac871d6813a03000035/java
import java.util.*;

public class Kata {
    public static String highAndLow(String numbers) {
        // Code here or
        String[] arr = numbers.split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; intArr.length > i; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);
        return Integer.toString(intArr[intArr.length - 1]) + " " + Integer.toString(intArr[0]);
    }

}

//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/java
public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        // return if a negative number
        if (num < 0) return num;

        // our number we will return
        int sortedNumber = 0;

        // loop with a maximum number int
        // perform loop in reverse
        for (int i = 9; i >= 0; i--) {
            // set a local number variable
            int tmpNumber = num;
            // while greater than 0
            while (tmpNumber > 0) {
                // get the digit
                int digit = tmpNumber % 10;
                // check for the greatest digit in the given number
                if (digit == i) {
                    // build the sortedNumber value
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                // reduce the loop variable
                tmpNumber /= 10;
            }
        }
        // return our sorted number
        return sortedNumber;
    }
}

//https://www.codewars.com/kata/56747fd5cb988479af000028/java
class Kata {
    public static String getMiddle(String word) {
        int position;
        int length;
        if (word.length() % 2 == 0) {
            position = word.length() / 2 - 1;
            length = 2;
        } else {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }
}

//https://www.codewars.com/kata/576bb71bbbcf0951d5000044/java
public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int sum = 0, count = 0;
        for (int i : input) {
            if (i > 0) {
                count++;
            } else {
                sum += i;
            }
        }
        return new int[]{count, sum};
    }
}

//https://www.codewars.com/kata/51c8991dee245d7ddf00000e/java
import java.util.*;

public class ReverseWords {

    public static String reverseWords(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}

//https://www.codewars.com/kata/541c8630095125aba6000c00/java
public class DRoot {
    public static int digital_root(int n) {
        int root = 0;

// Loop to do sum while
// sum is not less than
// or equal to 9
        while (n > 0 || root > 9) {
            if (n == 0) {
                n = root;
                root = 0;
            }

            root += n % 10;
            n /= 10;
        }
        return root;
    }
}

//https://www.codewars.com/kata/556deca17c58da83c00002db/java
public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
        if( n == 0 )
            return new double[0];
        double[] res = new double[n];
        for( int i = 0; i < n; i++ ) {
            if( i < 3 )
                res[i] = s[i];
            else
                res[i] = res[i-1]+res[i-2]+res[i-3];
        }
        return res;
    }
}

//https://www.codewars.com/kata/585d7d5adb20cf33cb000235/java
import java.util.Arrays;
public class Kata {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if(arr[0]==arr[1])
            return arr[arr.length-1];
        else
            return arr[0];

    }
}

//codewars.com/kata/5262119038c0985a5b00029f/train/java
public class Prime {

    public static boolean isPrime(int num) {
        // Filter out negative numbers, 0 and 1
        if (num <= 1)
            return false;
        // Factors of a number form pairs and the middle pair is the square root so no
        // reason to test numbers beyond that
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}