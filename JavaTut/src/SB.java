import java.util.*;
import java.util.stream.IntStream;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I'm a string builder");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Yeah");
        System.out.println(sb.insert(6, "big "));
        System.out.println(sb.replace(6, 9, "wig"));
        System.out.println(sb.delete(6, 10));
        System.out.println(sb.charAt(4));
        System.out.println(sb.indexOf("Yeah"));


    }
}
