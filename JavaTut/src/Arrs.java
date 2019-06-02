import java.util.*;
import java.util.stream.IntStream;

public class Arrs {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a1 = new int[10];
        a1[0] = 1;
        Arrays.fill(a1, 2);
        System.out.println(a1[0]);
        System.out.println(a1.length);

        String[] a2 = {"one", "two"};
        int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();
        for (int x: oneTo10) System.out.println(x);

        System.out.println(Arrays.binarySearch(oneTo10, 9));

        // multidimensional arrays
        int a3[][] = new int[2][2];
        String[][] a4 = {{"00", "10"},
                         {"01", "11"}};

        System.out.println(a4[1][1]);

        // copy array into another
        int a6[] = {1,2,3};
        int a7[] = Arrays.copyOf(a6, 3);
        System.out.println(Arrays.equals(a6, a7)); // true

        //sorting
        int a8[] = {3,2,1};
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8)); // [1,2,3]

    }
}
