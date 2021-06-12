import java.util.Scanner;

public class Binary_Search_Arrays {
    static Scanner input = new Scanner(System.in);

    public boolean checkPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String binarySearch(int[] arr, int q) {
        int left = 0;
        int right = arr.length - 1;

            while (left <= right) {
                int middle = (left + right) / 2;
                if (q == arr[middle]) {
                     return "The index of " + q + " is " + middle;
                } else if (q >= arr[middle]) {
                    left = middle + 1;
                } else if (q <= arr[middle]) {
                    right = middle - 1;
                }
            }
        return "The number " + q + " is not found in the array";
    }

    public static void main(String[] args) {
        int[] arr = new int[25];
        int q;
        int index = 0;

        Binary_Search_Arrays binary_search_arrays = new Binary_Search_Arrays();

        System.out.println("Please enter a number between 1 and 100: ");
        q = input.nextInt();

        for (int n = 2; n < 100; n++) {
            boolean prime = binary_search_arrays.checkPrime(n);
            if (prime) {
                arr[index] = n;
                index++;
            }
        }
        System.out.println(binary_search_arrays.binarySearch(arr, q));
    }
}
