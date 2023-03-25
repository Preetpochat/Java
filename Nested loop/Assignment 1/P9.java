// C B A
// C B A
// C B A
// print pattern
class P9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            char k = 'C';
            for (int j = 1; j <= 3; j++) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();

        }
    }

}