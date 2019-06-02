import javax.swing.*;
import java.util.*;
import java.util.stream.IntStream;

public class UsrInpt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        if(sc.hasNextLine()) {
            String userName = sc.nextLine();
            System.out.println("Hello " + userName);
            // Short Integer etc.
        }

        String jopName =
                JOptionPane.showInputDialog("Enter name");
        System.out.println("Hello " + jopName);
    }


}
