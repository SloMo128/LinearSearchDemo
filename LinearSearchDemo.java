import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearchDemo {

    public static void main(String[] args) {

        // Generate a random array of 20 integers
        int[] a = new Random().ints(20, 0, 100).toArray();

        // Print the array
        System.out.println(Arrays.toString(a));

        Scanner in = new Scanner(System.in);
        boolean done = false;

        while (!done) {

            System.out.print("Enter number to search for (-1 to quit): ");
            int n = in.nextInt();

            if (n == -1) {
                done = true;
            } else {
                int pos = LinearSearch.search(a, n);

                if (pos >= 0) {
                    System.out.println("Found at position: " + pos);
                } else {
                    System.out.println("Value not found.");
                }
            }
        }

        in.close();
    }
}
