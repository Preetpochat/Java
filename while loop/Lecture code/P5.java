//Multiply the digits of given no.
class P5 {
    public static void main(String[] args) {
        int N = 123;
        int temp = 1;
        while (N != 0) {
            int rem = N % 10;
            temp = temp * rem;
            N =N/10;
        }
        System.out.println(temp);
    }
}
