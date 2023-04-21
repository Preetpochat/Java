import java.io.*;

public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter no. of Rows");
        int row = Integer.parseInt(br.readLine());

        for (int x = 1; x <= row; x++) {

            for (int y = 1; y <= row; y++) {
                if (x == y) {
                    System.out.print("# ");
                } else {
                    System.out.print("= ");
                }

            }
            System.out.println();
        }

    }
}
