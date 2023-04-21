import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of rows");
        int row  = Integer.parseInt(br.readLine());

        for(int x = 1; x<=row; x++ ){
                char b = 'A';
                int a = 1;
                int c = row;
                char d = 'D' ;

            for(int y = 1; y<=row; y++){
                if (x%2!=0) {
                    
                    System.out.print(d--);
                    System.out.print(c-- + " ");
                } else {
                    System.out.print(b++);
                    System.out.print(a++ + " ");
                }

            }
            System.out.println();
        }
    }
}