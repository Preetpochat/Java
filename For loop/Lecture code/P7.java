// Check wether the given no. it is perfect no. or not
class P7 {
    public static void main(String[] args) {
        int N = 6;
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == N) {
            System.out.println(N + " is perfect no. ");
        } else {
            System.out.println(N + " is not a perfect no.");
        }
    }
}
