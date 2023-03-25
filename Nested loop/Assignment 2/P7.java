// 1 2 9 
// 4 25 6
// 49 8 81
// print the pattern
public class P7 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print(x*x +" ");
                } else {
                    System.out.print(x +" ");
                }
                x++;
            }
            System.out.println();
        }
    }
}
