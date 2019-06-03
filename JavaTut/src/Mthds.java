import java.util.*;
import java.util.stream.IntStream;

public class Mthds {

    static Scanner sc = new Scanner(System.in);

    // Methods
    // public methods are able to be executed by any program that knows of your class
    // private methods are only available within the body of the class
    // protected methods are available to class and any subclasses created
    // static means that it belongs to the class and not to any objects of the class
    // int is the return type

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static void changeMe(int cNum) {
        cNum = 10;
        System.out.println(cNum);
    }

    // variable length arguments ...
    public static int getSum2(int ... nums) {
        int sum = 0;
        for(int x: nums) {
            sum += x;
        }
        return sum;
    }

    public static int[] getNext2(int x) {
        int[] vals = new int[2];
        vals[0] = x + 1;
        vals[1] = x + 2;
        return vals;
    }

    public static List<Object> getRandList() {
        String name = "Derek";
        int age = 44;
        return Arrays.asList(name, age);
    }

    public static int factorial(int num) {
        if(num == 1) {
            return 1;
        } else {
            int result = num * factorial(num - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("5 + 4 = " + getSum(5, 4));

        // important to understand
        // all data that is passed to a method is passed by value
        // so changes inside of the method have no effect outside of a method
        int cNum = 0;
        changeMe(cNum);
        System.out.println("cNum = " + cNum);

        System.out.println("Sum : " + getSum2(1,2,3,4));

        int[] multVA = getNext2(5);
        for(int x: multVA) System.out.println(x);

        List<Object> randList = getRandList();
        System.out.println(randList);

        System.out.println("Fact 4 = " + factorial(4));


    }
}
