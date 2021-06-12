
import java.util.Scanner;

public class Linear_Search_Arrays {

    static Scanner input = new Scanner(System.in);

    public boolean checkPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }

    public void linearSearch (int q, int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            if (q == arr[i]) {
                System.out.println("The number " + q + " is in index " + i);
                break;
            }
            else if (q != arr[i] && q < arr[i]) {
                System.out.println("Number " + q + " is not found in the array");
                break;
            }
            else if (q > arr.length) {
                System.out.println("Number " + q + " is not found in the array");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[25];
        int q = 0;
        boolean prime;
        int index = 0;

        Linear_Search_Arrays linear_searchArrays = new Linear_Search_Arrays();

            System.out.println("Please enter a number between 1 and 100: ");
            q = input.nextInt();

            for (int n = 2; n < 100; n++) {
                prime = linear_searchArrays.checkPrime(n);
                if (prime) {
                    arr[index] = n;
                    index++;
                }
            }
            linear_searchArrays.linearSearch(q, arr);
    }
}
