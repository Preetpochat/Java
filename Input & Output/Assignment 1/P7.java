import java.io.*;

public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter no. pf rows");
        int row = Integer.parseInt(br.readLine());

        int num = (row * row + row) / 2;
        int ch1 = 64 + num;
        char ch2 = (char) ch1;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                if (row % 2 == 0) {
                    if (i % 2 != 0) {
                        System.out.print(num + " ");
                    } else {
                        System.out.print(ch2 + " ");
                    }
                    num--;
                    ch2--;
                } else {
                    if (i % 2 != 0) {
                        System.out.print(ch2 + " ");
                    } else {
                        System.out.print(num + " ");
                    }
                    num--;
                    ch2--;
                }
            }
            System.out.println();
        }

    }

}