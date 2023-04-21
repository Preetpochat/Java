import java.io.*;

public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter First char");
        char ch1 = (char) br.read();
        br.skip(2);
        System.out.println("Enter second char");
        char ch2 = (char) br.read();

        int count = 0;
        for (int x = 1; x <= ch2 - ch1; x++) {
            if (ch1 != ch2) {
                count++;

            } else {
                System.out.println(ch1);
                System.out.println(ch2);
            }
        }
        System.out.println(count);

    }

}
