// F 5 D 3 B 1 
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1
// print the pattern
public class P10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            char x = 'F';
            int y = 6;

            for (int j = 1; j <= 6; j++) {
                if (j % 2 != 0) {
                    System.out.print(x + " ");
                } else {
                    System.out.print(y + " ");
                }
                x--;
                y--;
            }
            System.out.println();
        }
    }
}
