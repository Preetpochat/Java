import java.io.*;
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of Array");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the Element");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i  = 0 ; i<arr.length; i++){
            int N= arr[i];
            int temp = arr[i];
            while (N!=0) {
                N = N % 10;
                System.out.print(N);
                temp = temp/10;
                N = temp;
            }
            System.out.println();
        }

    }
}
