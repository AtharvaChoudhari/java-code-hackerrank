import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();

        // Review this once
        // Nesting

        if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        }

        else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        }

        else if (n % 2 != 0 && n <= 100) {
            System.out.println("Weird");
        }

        else if (n % 2 == 0 && n > 20 && n <= 100) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Please enter a number b/w 1 to 100");
        }
    }
}
