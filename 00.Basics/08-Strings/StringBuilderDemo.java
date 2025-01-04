public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Suyash");
        
        stringBuffer.append(" Lawand"); // Append Last Name.
        stringBuffer.append(75); // Append something at last.

        stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length()); // Deleted Roll no. at last.

        System.out.println("Result String => " +  stringBuffer.toString());
    }
}
