// 1A 2B 3C
// 1A 2B 3C
// 1A 2B 3C
class P4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            int x = 1;
            char y = 'A';
            for (int j = 1; j <= 3; j++) {
                System.out.print(x++);
                System.out.print(y++ + " ");
            }
            System.out.println();
        }
    }
}
