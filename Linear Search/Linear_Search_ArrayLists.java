import java.util.Scanner;
import java.util.ArrayList;


public class Linear_Search_ArrayLists {

    static Scanner input = new Scanner(System.in);

    public boolean checkPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }

    public void linearSearch (int q, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (q == arr.get(i)) {
                System.out.println("The number " + q + " is in index " + i);
                break;
            }
            else if (q != arr.get(i) && q < arr.get(i)) {
                System.out.println("Number " + q + " is not found in the array");
                break;
            }
            else if (q >= 100) {
                System.out.println("Number " + q + " is not found in the array");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int q = 0;
        boolean prime;
        ArrayList<Integer> primeArr = new ArrayList<>();
       boolean rep = false;


        Linear_Search_ArrayLists linearSearchArrayLists = new Linear_Search_ArrayLists();

        do {
            System.out.println("Please enter a number between 1 and 100: ");
            q = input.nextInt();
            rep = true;

            for (int n = 2; n < 100; n++) {
                prime = linearSearchArrayLists.checkPrime(n);
                if (prime) {
                    primeArr.add(n);
                }
            }
            linearSearchArrayLists.linearSearch(q, primeArr);
        }
        while (rep);
    }
}
