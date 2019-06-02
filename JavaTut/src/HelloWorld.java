import java.util.*;
import java.util.stream.IntStream;

public class HelloWorld {

    static Scanner sc = new Scanner(System.in); // taking input from the keyboard

    final double SHORTPI = 3.14159; // constant variable, final

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int var1 = 100;
        int v2, v3;

        // datatypes
        // byte, short, char, boolean, int, float, double, long
        System.out.println(Byte.MAX_VALUE);

        boolean happy = true;
        char a = 'a';
        // \n \t \b \f \r  // escape characters
        float fNum = 1.11111111F;
        float fNum2 = 1.11111111F;
        System.out.println("Float : " + (fNum + fNum2)); //precision!

        double dblNum = 1.111111111111111;
        double thousand = 1e+3; //scientific notation
        System.out.println(thousand);
        long bigNum = 123_456_789;
        System.out.println(bigNum);

        // CASTING
        // converting from one datatype to another
        // by default you can always convert from smaller types to larger types
        int smInt = 10;
        long smLong = smInt;

        double cDbl = 1.234;
        int cINt = (int) cDbl;
        System.out.println(cINt);

        long bigLong = 2147865756784L;
        int bInt = (int) bigLong;
        System.out.println(bInt);

        String favNum = Double.toString(1.618);
        //Byte.parseByte()
        int strInt = Integer.parseInt("10");
        System.out.println(strInt);

        // MATH FUNCTIONS

    }
}