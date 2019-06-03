import java.util.*;

public class Thrds {
    // Threads
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "Thread 1");
        Thread t2 = new Thread(new MyThread(), "Thread 2");
        Thread t3 = new Thread(new MyThread(), "Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}


