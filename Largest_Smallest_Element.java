package GFG;
import java.util.*;


public class Largest_Smallest_Element {

    // Pair class to store both minimum and maximum values
    static class Pair {
        long max;
        long min;

        Pair(long max, long min) {
            this.max = max;
            this.min = min;
        }
    }

    // Function to get minimum and maximum values from an array
    static Pair getMinMax(long a[], long n) {
        long max = a[0];
        long min = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        return new Pair(max, min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        long n = scanner.nextLong();

        // Input array elements
        long[] array = new long[(int) n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }

        // Call the getMinMax function and print the result
        Pair result = getMinMax(array, n);
        System.out.println("Maximum value: " + result.max);
        System.out.println("Minimum value: " + result.min);

        scanner.close();
    }
}
