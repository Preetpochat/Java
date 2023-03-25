// Palindrome no.
class P8 {
    public static void main(String[] args) {
        int N = 2332;
        int rev = 0;
        int temp = N;
        while (N != 0) {
            int rem = N % 10;
            rev = rev * 10 + rem;
            N = N / 10;
        }
        if (temp == rev) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        ;
    }
}
