// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
class P2 {

    public static void main(String[] args) {
        int row = 9;
        int N = (row / 2) + 1;
        int z = row/2;
        for (int i = 1; i <= row; i++) {
            if (i <= N) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // System.out.println();
            } else if (i > N) {
                for (int k = 1; k <= z; k++) {
                    System.out.print("* ");

                }
                z--;
            }
            System.out.println();
        }

    }
}
