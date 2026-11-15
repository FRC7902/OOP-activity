/**
 * The program starts here. Click "Run" above main() to try it.
 */
public class Main {

    public static void main(String[] args) {
        // Build two objects from the same Car blueprint
        Plane plane1 = new Plane("Cathay Pacific");
        Plane plane2 = new Plane("Air Canada");

        plane1.takeOff(10);
        plane2.takeOff(15);

        System.out.println("Plane 1: " + plane1.company + " Flight Time: " + plane1.flight_t);
        System.out.println("Plane 2: " + plane2.company + " Flight Time: " + plane2.flight_t);
    }
}
