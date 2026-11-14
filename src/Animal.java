public class Animal {
    int age;
    String name;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("Animal sound here");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}