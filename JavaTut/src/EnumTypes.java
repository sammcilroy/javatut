import java.util.*;
import java.util.stream.IntStream;

public class EnumTypes {

    static Scanner sc = new Scanner(System.in);
    //Enumerated Types
    public enum Day {Monday, Tuesday, Wednesday};

    public static void main(String[] args) {

        Day favDay = Day.Monday;
        System.out.println("Favorite day is " + favDay);

    }
}
