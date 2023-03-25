// print all the digits of given integer 
class P3 {
    public static void main(String[] args) {
        int N = 5689;
        while (N!=0) {
            System.out.println(N%10);
            N= N/10;
        }
    }
    
}
