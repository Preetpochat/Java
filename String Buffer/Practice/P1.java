class P1{
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("1234512345123451");
        System.out.println(sb.capacity());
        System.out.println(System.identityHashCode(sb));
        sb.ensureCapacity(17);
        sb.append("Preet");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());
        // System.out.println(sb.length());
        
        // sb.append("12345123451234512");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // System.out.println(System.identityHashCode(sb));

        // sb.append();
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // System.out.println(System.identityHashCode(sb));
        // sb.append("Preet");
        // System.out.println(sb.length());
        // sb.append("Preet");

        // for (int i = 0; i < 18; i++) {
        //     sb.append(i);
        // }
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // System.out.println(sb);
    }
}