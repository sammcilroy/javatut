import java.util.*;
import java.util.stream.IntStream;

public class RelOps {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Relational Operators : == != > < >= <=
        // Logical Operators ! && ||

        int age = 12;
        if((age > 5) && (age<=6)) {
            System.out.println("Go to Kindergarten");
        } else if ((age > 7) && (age <=13)) {
            System.out.println("Go to Middle School");
        } else if ((age > 14) && (age <=18)) {
            System.out.println("Go to High School");
        } else {
            System.out.println("Stay Home");
        }

        System.out.println("true || false = " + (true || false));
        System.out.println("!true = " + (!true));

        // ternary operator
        boolean canVote = (age >= 18) ? true : false;
        System.out.println("Can vote : " + canVote);

        // switch statement
        String lang = "England";
        switch(lang) {
            case "Chile" : case "Cuba" :
                System.out.println("Hola");
                break;
            case "France" :
                System.out.println("Bonjour");
                break;
            case "Japan" :
                System.out.println("Konnichiwa");
                break;
            default :
                System.out.println("Hello");

        }
    }
}
