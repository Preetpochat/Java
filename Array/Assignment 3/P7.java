import java.io.*;

public class P7 {
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
            while (N != 0) {
                int temp = N % 10;
                int multi = 1;
                for (int j = 1; j <= temp; j++) {
                    multi = multi * j;
                }
                sum = multi + sum;
                N = N / 10;
                if (sum == arr[i]) {
                    System.out.println("Strong no. " + arr[i] + " found at index: " + i);

                }
            }
        }

    }
}