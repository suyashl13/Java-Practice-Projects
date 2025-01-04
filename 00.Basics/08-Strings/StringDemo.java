public class StringDemo {
    public static void main(String[] args) {
        String masterString = "Hi, Hello World!";

        // Demo of concat() and charAt().
        System.out.println("Character at 4 => " + masterString.charAt(4));

        masterString = masterString + ", Hi Moon!";

        // Concatenated using +, and yes new instanse was created in string constant pool.
        System.out.println(masterString);
    }
}
