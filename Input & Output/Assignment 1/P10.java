import java.io.*;

public class P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start no.:-");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the End no.:-");
        int num2 = Integer.parseInt(br.readLine());

        for (int i = num1; i <= num2; i++) {
            int count = 0;
            // int temp = num1;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

}
