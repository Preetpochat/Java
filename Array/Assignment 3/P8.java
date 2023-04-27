import java.io.*;

public class P8 {
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
            int temp1 = arr[i];
            int count = 0;
            while (temp1 != 0) {
                temp1 = temp1 / 10;
                count++;
            }
            int sum = 0;
            for (int j = 1; j <= count; j++) {
                int temp2 = N;
                N = N % 10;
                int multi = 1;
                for (int k = 1; k <= count; k++) {
                    multi = multi * N;
                }
                N = temp2 / 10;
                sum = sum + multi;
            }
            if (sum == arr[i]) {
                System.out.println("Amstrong no. " + arr[i] + " found at index: " + i);

            }
        }
    }
}