class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Preet");
        System.out.println(System.identityHashCode(str));

        str.append("Pochat");

        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}