import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int valueA = A.length();
        int valueB = B.length();
        int sumOfAB = valueA + valueB;
        System.out.println(sumOfAB);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        String firstA = A.substring(0, 1).toUpperCase();
        String remainingLettersA = A.substring(1, A.length());
        String nameA = firstA + remainingLettersA;
        System.out.print(nameA + " ");
        String firstB = B.substring(0, 1).toUpperCase();
        String remainingLettersB = B.substring(1, B.length());
        String nameB = firstB + remainingLettersB;
        System.out.print(nameB);

    }
}



