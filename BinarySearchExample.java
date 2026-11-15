import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sorted array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array (Binary search requires a sorted array)
        Arrays.sort(array);

        // Input element to be searched
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(array, key);

        // Display result
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }

        scanner.close();
    }

    // Binary search method
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (array[mid] == key) {
                return mid;
            }

            // If key greater, ignore left half
            if (array[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Element not present
        return -1;
    }
}

