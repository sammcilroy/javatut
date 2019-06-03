import java.io.*;
import java.util.*;

public class Gnrc {
    // Generics
    // generics allow you to use any object type and perform an operation on it
    public static void main(String[] args) {
        String[] gA1 = {"one", "two"};
        Integer[] gA2 = {1,2,3,4};
        printStuff(gA1);
        printStuff(gA2);

    }

    public static <E> void printStuff(E[] arr) {
        for(E x: arr) System.out.println(x);
    }

    public static void printAL(ArrayList<?> aL) {
        for(Object x : aL) System.out.println(x);
    }

}
