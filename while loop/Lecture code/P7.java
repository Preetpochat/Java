// Reverse o no.
class P7 {
    public static void main(String[] args) {
        int N = 6531;
        int rev = 0;
        while (N != 0) {
            int rem = N % 10;
            rev = rev * 10 + rem;
            N = N / 10;
        }
        System.out.println(rev);
    }
}
