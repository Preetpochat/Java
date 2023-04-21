import java.io.*;

public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Start No.");
        int sta = Integer.parseInt(br.readLine());
        System.out.println("Enter End No.");
        int end = Integer.parseInt(br.readLine());
        int temp1 = sta;
        int temp2 = end;
        int diff = (end - sta) + 1;
        for (int x = 1; x <= diff; x++) {

            if (temp2 % 2 == 0) {
                System.out.print(temp2 +" ");
            }
            temp2--;
        }
        System.out.println();
        for (int x = 1; x <= diff; x++) {

            if (temp1 % 2 != 0) {
                System.out.print(temp1 +" ");
            }
            temp1++;
        }
    }
}
