// count the no. of factors of given no.
class P5 {
    public static void main(String[] args) {
        int N = 6;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
