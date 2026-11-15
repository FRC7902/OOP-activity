public class Phone {

   String phoneBrand;
   int gbStorage;

    public Phone(String brand) {
        this.phoneBrand = brand;
        gbStorage = 64;
    }

    void addStorage() {
        gbStorage += 10;
    }

    void useStorage() {
        gbStorage -= 1;
    }


}

/* 

Create two different objects from your class using new, with different starting values
Call your methods on each object using the dot operator (for example myCar.accelerate();)
Print out at least one field from each object using System.out.println(...)


 */