/**
 * The program starts here. Click "Run" above main() to try it.
 */
public class Main {
    public static void main(String[] args) {
        // Build two objects from the same Car blueprint
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        // Use the dot to call methods on each object
        car1.accelerate();
        car1.accelerate();
        car2.accelerate();

        // Each object keeps its own values
        System.out.println(car1.brand + " speed: " + car1.speed); // Toyota speed: 20
        System.out.println(car2.brand + " speed: " + car2.speed); // Honda speed: 10

        car1.brake();
        System.out.println(car1.brand + " speed: " + car1.speed); // Toyota speed: 0

        Book book1 = new Book("Harry Potter", 500, 0);
        Book book2 = new Book("Project Hail Mary", 400, 0);

        for (int i = 0; i < 90; i++) {
            book1.read();
            book1.read();
            book2.read();
        }
        book1.ripPages(200);
        System.out.println(book1.title + "\n total pages: " + book1.totalPage + "\n current page: " + book1.currentPage);
        System.out.println(book2.title + "\n total pages: " + book2.totalPage + "\n current page: " + book2.currentPage);
    }
}
