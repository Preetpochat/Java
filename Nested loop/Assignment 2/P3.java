// 14 15 16 17 
// 15 16 17 18
// 16 17 18 19
// 17 18 19 20
// print the pattern
class P3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int x = i + 13;
            for (int j = 1; j <= 4; j++) {
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}