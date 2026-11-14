public class Phone {
    public String phoneName;
    public int phonePrice;
    public int phoneBatteryPercentage;
    public int phoneNumber;
    public Phone(String name, int price, int batteryPercentage, int number) {
        this.phoneName = name;
        this.phonePrice = price;
        this.phoneBatteryPercentage = batteryPercentage;
        this.phoneNumber = number;
    }
    public void Call(int number) {
        System.out.println("Calling " + number + " from " + this.phoneName);
    }
    public void Update(int OSNumber) {
        System.out.println("Updating " + this.phoneName + " to OS version " + OSNumber);
    }
    public void charge(int percentage)
    {
        this.phoneBatteryPercentage = percentage;
    }

}
