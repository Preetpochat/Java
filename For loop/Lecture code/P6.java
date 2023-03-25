// Check whether it is Prime no.
class P6 {
    public static void main(String[] args) {
        int N = 5;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
}
