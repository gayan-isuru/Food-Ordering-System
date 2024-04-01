package Abstraction;

public class Nimal extends Amal {
    void jump() {
        System.out.println("Jummping");
    }

    void eat() {
        System.out.println("eating");
    }

    void runq() {
        System.out.println("Running a");
    }

    public static void main(String[] args) {
        Nimal obj = new Nimal();
        obj.eat();
        obj.run();
        obj.jump();
    }

}
