// EqualsIgnoreCase method 

public class P7 {
    public static void main(String[] args) {
        
        String str1 = "PREET";
        String str2 = new String("Preet");
        String str3 = "PrEeT";

        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
    }    
}
