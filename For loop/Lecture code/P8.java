// Check whether any given no. as input is Amstrong no.
class P8 {
    public static void main(String[] args) {
        int N = 1634;
        int temp1 = N;
        int temp2 = N;
        int count = 0;
        int sum = 0;
        while (N != 0) {
            count++;
            N = N / 10;
        }
        while (temp1 != 0) {
            int rem = temp1 % 10;
            int multi = 1;
            for (int i = 1; i <= count; i++) {
                multi = multi * rem;
            }
            temp1 = temp1 / 10;
            sum = sum + multi;
        }
        if (temp2 == sum) {
            System.out.println(temp2 + " is amstrong number");
        } else {
            System.out.println(temp2 + " is not a amstrong number");
        }
    }
}
