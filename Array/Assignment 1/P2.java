// Product of even integer of array

import java.io.*;

public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter the size of array");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the element");
        int multi = 1;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 == 0) {
                multi = multi * arr[i];

            }
        }
        System.out.println("Product of Even Integer of array = " + multi);

    }
}
