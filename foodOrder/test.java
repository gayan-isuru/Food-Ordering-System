package foodOrder;

public class test {

    String name;

    void phone() {
        System.out.println("take a call from " + name);

    }

    public static void main(String[] args) {
        test phone1 = new test();
        test phone2 = new test();
        test phone3 = new test();
        phone1.name = "Samsung";
        phone2.name = "NOkia";
        phone3.name = "Apple";
        phone1.phone();
        phone2.phone();
        phone3.phone();

    }
}