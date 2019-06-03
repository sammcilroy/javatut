// Exception Handling
import java.util.*;
import java.util.stream.IntStream;



public class ExceptHand {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            //throw new Exception("Bad Stuff"); // throw a custom exception
            int badInt = 10/0;
        } catch(ArithmeticException ex) { // catch the expected exception ArithmeticException (/ zero)
            System.out.println("Can't divide by Zero");
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        } catch (Exception ex) { // catch any expression, bad practice but widely used
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Clean Up"); // finally bloc, clean up, close files/databases etc.
        }

    }
}
