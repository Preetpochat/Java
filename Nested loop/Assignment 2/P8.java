// A b C d 
// e F g H
// I j K l
// m N o P
public class P8 {
    public static void main(String[] args) {
        char x = 'A';
        char y = 'a';
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print(x +" ");
                } else {
                    System.out.print(y +" ");
                }
                x++;
                y++;
            }
            System.out.println();
        }
    }
}
