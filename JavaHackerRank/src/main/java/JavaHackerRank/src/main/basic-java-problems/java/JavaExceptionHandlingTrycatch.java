import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandlingTrycatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextInt()/scanner.nextInt());
        } catch (ArithmeticException aex) {
            System.out.println(aex);
        } catch (InputMismatchException imex) {
            System.out.println(imex.getClass().getName());
        }
    }
}
