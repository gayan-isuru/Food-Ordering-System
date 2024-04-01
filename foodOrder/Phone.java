package foodOrder;

public class Phone {
    String name;
    String color;
    String model;

    public void call() {
        System.out.println("Take a call from " + name + " And its color is " + color);

    }

    public void browsInternet() {
        System.out.println("Brows internet By " + name + " Its color " + color + " mode is " + model);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.name = "Samsung";
        phone1.color = "Black";
        phone1.call();

        Phone phone2 = new Phone();
        phone2.name = "Nokia";
        phone2.color = "dark blue";
        phone2.model = "A serice";
        phone2.browsInternet();

    }

}
