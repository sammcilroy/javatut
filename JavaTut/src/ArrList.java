import java.util.*;
import java.util.stream.IntStream;

public class ArrList {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> aL1 = new ArrayList<String>(20);
        aL1.add("Sue");
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        for (Integer x: aL2) System.out.print(x + " ");
        System.out.println(aL2.get(1)); // get value at
        aL2.set(1,5); // add a value at index
        aL2.remove(3); // remove value at index
        //aL2.clear(); //clear the array

        Iterator it = aL2.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
