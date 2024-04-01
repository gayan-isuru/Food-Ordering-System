package inheritance;

public class oldPhone {
    String name;
    int model;

    void call() {
        System.out.println("This is old phone");

    }

    void message() {
        System.out.println("This message send by " + name);
        System.out.println("model number is " + model);

    }

    public static void main(String[] args) {
        oldPhone obj = new oldPhone();
    }

}
