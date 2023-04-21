import java.io.*;

public class P5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter no. of Rows");
        int row = Integer.parseInt(br.readLine());

        int temp1 = 0;
        int temp2 = 1;
        int temp3 = 0;
        for(int x = 1; x<=row; x++){

            for(int y = 1; y<=x; y++){

                System.out.print(temp3 + " ");
                temp3 = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp3;
            }
            System.out.println();
        }
    }
}
