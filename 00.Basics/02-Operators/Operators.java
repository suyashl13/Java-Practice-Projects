public class Operators {
    public static void main(String[] args) {
        int x = 6;
        int y = 5;

        boolean xGtY = x > y;
        System.out.println(xGtY);

        boolean xStY = x < y;
        System.out.println(xStY);

        // Combining operators using and and or;
        System.out.println(xGtY &&       xStY); // T and F => F
        System.out.println(xGtY || xStY); // T or F => T

        // Negating the result (!)
        System.out.println(!xGtY); // False
        
        /*
         # All Other Operators
         * <    => Smaller than
         * >    => Greater Than
         * ==   => Equality check
         * >=   => Equals or greater than
         * <=   => Equals or smaller than
         * !    => Negation
         * &&   => AND (short circuit)
         * ||   => OR (short circuit)
         */
    }    
}
