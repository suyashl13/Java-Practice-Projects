class IPhone {
    static String osName;
    static String manifacturer;
    String ownerName;

    static {
        osName = "IOS17";
        manifacturer = "Apple";

        System.out.println("Static block called!");
    }

    IPhone() {
        System.out.println("Constructor was called!");
    }

    static void showCommonDetails() {
        System.out.println("OsName\t\tManifactuter\t\t");
        System.out.println(osName + "\t\t" + manifacturer + "\t\t");
    }

    void showAllDetails() {
        System.out.println("OsName\t\tManifactuter\t\tOwner");
        System.out.println(osName + "\t\t" + manifacturer + "\t\t" + ownerName);
    }

    static void showAllDetailsWithObject(IPhone iPhone) {
        System.out.println("OsName\t\tManifactuter\t\tOwner");
        System.out.println(osName + "\t\t" + manifacturer + "\t\t" + iPhone.ownerName);
    }

}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        IPhone suyashsIPhone = new IPhone();
        suyashsIPhone.ownerName = "Suyash Lawand";

        // Static vars can be accessed using
        // className only no need of creating objects of class.
        System.out.println("MfdBy => " + IPhone.manifacturer);

        // Static methods can be directly called
        // using className same as static vars.
        // Example
        IPhone.showCommonDetails();

        // However static vars can be accessed by non static
        // Methods internally. But Vice - Versa is not possible.
        suyashsIPhone.showAllDetails();

        // We can take object in static method and
        // use non static variables.
        IPhone.showAllDetailsWithObject(suyashsIPhone);

        try {
            // Loading the class as we want to call static block
            // of IPhone class
            Class.forName("IPhone");
        } catch (Exception e) {
            System.out.println("Class with specified name was not found!");
        }
    }
}
