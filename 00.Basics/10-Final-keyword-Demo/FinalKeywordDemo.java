class FinalDemo {

    final int a = 21;

    public int modifyA() {
        // a = 33; This is not allowed
        return a;
    }

    // Now this method cannot be overriden as its final now.
    public final void show() {
        System.out.println(a);
    }

}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        new FinalDemo().show();
    }
}
