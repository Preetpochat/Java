import java.io.*;

public class P4 {
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
            int count = 0;
            for (int j = 1; j < arr[i]; j++) {
                if (N % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime " + arr[i] + "found at index: " + i);
            }

        }

    }

}