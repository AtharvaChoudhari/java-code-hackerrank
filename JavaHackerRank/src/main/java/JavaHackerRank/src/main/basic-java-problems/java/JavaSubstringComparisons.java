import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "" + s.substring(0, k);
        String largest = "" + s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i < s.length(); i++) {
            if (k + i < s.length() + 1) {
                String subString = s.substring(i, k + i);
                if (subString.compareTo(smallest) < 0) {
                    smallest = subString;
                }
                if (subString.compareTo(largest) > 0) {
                    largest = subString;
                }
            }
        }

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

