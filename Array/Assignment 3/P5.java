import java.io.*;

public class P5 {
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
            int sum = 0;
            for (int k = 1; k < arr[i]; k++) {
                if (N % k == 0) {
                    sum = sum + k;
                }

            }
            if (sum == arr[i]) {
                System.out.println("Perfect no. " + arr[i] + " found at index: " + i);

            }
        }

    }
}