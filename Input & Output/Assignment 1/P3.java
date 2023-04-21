import java.io.*;

public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter no. of rows");
        int row = Integer.parseInt(br.readLine());

        for (int x = 1; x <= row; x++) {
            int num = row + (1 - x);

            for (int y = num; y > 0; y--) {

                System.out.print(num*x + " ");
                num--;
            }
            System.out.println();
        }
    }
}
