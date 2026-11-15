public class Main {
     public static void main(String[] args) {
        // Build two objects from the same Car blueprint
        Phone phone1 = new Phone("Samsung");
        Phone phone2 = new Phone("Apple");

        phone1.addStorage();
        phone2.addStorage();

        System.out.println(phone1.phoneBrand + " gigabytes: " + phone1.gbStorage);
        System.out.println(phone2.phoneBrand + " gigabytes: " + phone2.gbStorage);


        phone1.useStorage();
        System.out.println(phone1.phoneBrand + " gigabytes: " + phone1.gbStorage); 
    }
}
