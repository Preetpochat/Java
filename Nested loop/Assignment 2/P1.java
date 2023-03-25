// C2W1 C2W2 C2W3
// C2W1 C2W2 C2W3
// C2W1 C2W2 C2W3
class P1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            int x = 1;
            for (int j = 1; j <= 3; j++) {
                System.out.print("C");
                System.out.print("2");
                System.out.print("W");
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}