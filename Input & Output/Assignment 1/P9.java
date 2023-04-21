import java.io.*;

public class P9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the no.:-");
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        // int count = 0;
        for (int i = num; i != 0;) {
            int num2 = i % 10;
            int temp = 1;
            for (int j = 1; j <= num2; j++) {
                temp = temp * j;
            }
            sum = sum + temp;
            i = i / 10;
        }
        System.out.println(sum);

    }
}
