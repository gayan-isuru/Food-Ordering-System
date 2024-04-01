package inheritance;

public class newPhone extends oldPhone {
    int number;

    void browsInternet() {

    }

    public static void main(String[] args) {
        newPhone obj1 = new newPhone();
        obj1.name = "Samsung";
        obj1.model = 122254;
        obj1.message();
    }

}
