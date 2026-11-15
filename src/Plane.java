public class Plane {
    String company;
    int flight_t;

    Plane(String planecompany) {
        company = planecompany;
        flight_t = 0;
    }

    void takeOff(int time) {
        flight_t = time;
    }

    void land() {
        flight_t = 0;
    }

}


