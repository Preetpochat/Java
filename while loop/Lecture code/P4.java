// Print sum of its digits of given interger
class P4 {
    public static void main(String[] args) {
        int N =123;
        int sum = 0;
        while (N!=0) {
            int rem = N%10;
            sum =sum+rem;
            N=N/10;
        }
        System.out.println(sum);
    }
}
