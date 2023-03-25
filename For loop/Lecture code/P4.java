// Print all the factors of given no.
class P4 {
    public static void main(String[] args) {
        int N = 6;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }
    }

}
