import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int [] week = new int[6];
         week[0] = 12;
         week[1] = 42;
         week[2] = 244;
         week[3] = 4;
         week[4] = 123;
         week[5] = 12;


       SalesManager salesManager = new SalesManager(week);
       System.out.println(salesManager.max());
    }
}