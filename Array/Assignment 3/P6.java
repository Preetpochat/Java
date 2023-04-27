import java.io.*;

public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the Element");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length; i++) {
            int N = arr[i];
            int temp2 = 0;
            while (N != 0) {
                int temp = N % 10;
                temp2 = temp2 * 10 + temp;
                N = N / 10;
            }
            if (temp2 == arr[i]) {
                System.out.println("Palindrome no. " + arr[i] + " found at index: " + i);

            }

        }

    }
}