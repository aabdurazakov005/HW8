import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractions = {1.57, 7.654, 9.986};
        int[] dates = new int[6];
        dates[0] = 1998;
        dates[1] = 1999;
        dates[2] = 2000;
        dates[3] = 2001;
        dates[4] = 2002;
        dates[5] = 2003;


        System.out.println("Task 2.");
        System.out.print(Arrays.toString(numbers));
        System.out.println();
        System.out.print(Arrays.toString(fractions));
        System.out.println();
        System.out.print(Arrays.toString(dates));
        System.out.println();
        System.out.println("");

        System.out.println("Task 3.");
        for (int i = numbers.length - 1; i >= 0; i = i - 1) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = fractions.length - 1; j >= 0; j--) {
            System.out.print(fractions[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int d = dates.length - 1; d >= 0; d--) {
            System.out.print(dates[d]);
            if (d > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task 4.");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}