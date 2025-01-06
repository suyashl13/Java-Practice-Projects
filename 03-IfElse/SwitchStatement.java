public class SwitchStatement {
    public static void main(String[] args) {
        int age = 25;

        switch (age) {
            case 18:
                System.out.println("User is 18");
                break;
            case 25:
                System.out.println("User is 25");
                break;
            default:
                System.out.println("User is not 18 or 25");
        }
    }
}
