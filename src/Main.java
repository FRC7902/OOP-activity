/**
 * The program starts here. Click "Run" above main() to try it.
 */
public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("iPhone", 1234, 67, 1234567890);
        Phone phone2 = new Phone("Android", 123, 17, 911);

        phone1.charge(100);
        phone2.charge(1);
        System.out.println("phone1 percentage: " + phone1.phoneBatteryPercentage);
        System.out.println("phone2 percentage: " +phone2.phoneBatteryPercentage);
    }
}
