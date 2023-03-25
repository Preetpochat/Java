// 26 Z 25 Y 
// 24 X 23 W
// 22 V 21 U
// 20 T 19 S
// print the pattern
class P5 {
    public static void main(String[] args) {
        int x = 26;
        char y = 'Z';
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 2; j++) {
                System.out.print(x-- + " ");
                System.out.print(y-- + " ");
            }
            System.out.println();
        }
    }
}
