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

class SomeOtherClass extends FinalDemo  {
    // Cannot override the final method from FinalDemoJava(67109265)
    // public void show() { }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        new FinalDemo().show();
    }
}
