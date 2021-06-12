import java.util.Scanner;
import java.util.ArrayList;

public class Binary_Search_ArrayLists {
    static Scanner input = new Scanner(System.in);

    public boolean checkPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }

    public String binarySearch(ArrayList<Integer> arr, int q) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (q == arr.get(middle)) {
                return "The index of " + q + " is " + arr.indexOf(q);
            } else if (q >= arr.get(middle)) {
                left = middle + 1;
            } else if (q <= arr.get(middle)) {
                right = middle - 1;
            }
        }
        return "The number " + q + " is not found in the array";
    }

    public static void main(String[] args) {

        ArrayList<Integer> primeArr = new ArrayList<>();
        boolean rep;


        Binary_Search_ArrayLists binary_search_arrayLists = new Binary_Search_ArrayLists();

        do {
            System.out.println("Please enter a number between 1 and 100: ");
            int q = input.nextInt();
            rep = true;

            for (int n = 2; n < 100; n++) {
                boolean prime = binary_search_arrayLists.checkPrime(n);
                if (prime) {
                    primeArr.add(n);
                }
            }
            System.out.println(binary_search_arrayLists.binarySearch(primeArr, q));
        }
        while (rep);
    }
}
