import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the element");

        int multi = 1;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                multi = multi * arr[i];

            }
        }
        System.out.println("Product = " + multi);

    }
}
