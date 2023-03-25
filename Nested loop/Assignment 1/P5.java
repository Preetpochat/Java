// 12 12 12
// 13 13 13
// 14 14 14
// print pattern
class P5 {
    public static void main(String[] args) {
        int x = 12;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(x + " ");
            }
            System.out.println();
            x++;
        }
    }
}
