package thisk;

public class Thiskey {
    String name;
    int age;

    Thiskey(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        Thiskey obj = new Thiskey("Gayan", 23);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

}
