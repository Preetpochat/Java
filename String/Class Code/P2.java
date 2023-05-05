public class P2 {
    public static void main(String[] args) {
        String str1 = "Kanha";
        String str2 = str1;
        String str3 = new String(str2);
        String str4 = new String("Preet");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
    
}
