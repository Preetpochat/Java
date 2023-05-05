// CompareTOEgnoreCase code using myfun()

public class P4 {
    public static void main(String[] args) {
        String str1 = "ashish";
        String str2 = "aShish";

        System.out.println(myfun(str1, str2));
    }

    static int myfun(String str1, String str2) {
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        if (ch1.length != ch2.length) {
            return (ch1.length - ch2.length);
        }
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                if (ch1[i] - ch2[i] != 32 || ch1[i] - ch2[i] != -32) {
                    return (ch1[i] - ch2[i]);
                }
            }
        }
        return 0;
    }
}
