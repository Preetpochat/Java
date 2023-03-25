class P1 {
    public static void main(String[] args) {
        int row = 7;
        int num = (row/2)+1;
        int N = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= N; j++) {
                if (i + j >= num+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            N++;
        }
        // int num2 = num-1;
        // int z = row - 1; ;
        // for (int k = 1; k <= num2; k++) {
            
        //     for (int j = 1; j <= z; j++) {
        //         if (j >= k+1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //     z--;
        // }

    }
}
