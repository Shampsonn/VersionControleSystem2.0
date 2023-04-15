import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         long[] week = new long[3];
         week[0] = 1234;
         week[1] = 42341;
         week[2] = 24421;

       SalesManager salesManager = new SalesManager(week);
       System.out.println(salesManager.max());
    }
}