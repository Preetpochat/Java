// 1 4 9 
// 16 25 36
// 49 64 81
// print the pattern
public class P6 {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 1;
        // int sum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(x1 + " ");
                x2 = x2 + 2;
                x1 = x1 + x2;

            }
            System.out.println();
        }
    }
}
