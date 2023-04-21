import java.io.*;

class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the element");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum = " + sum);

    }
}