package extra;

public class bank {
    int rupees;

    bank() {
        rupees = 1000;

    }

    bank(int x) {
        rupees = x;

    }

    public static void main(String[] args) {
        bank nimal = new bank();
        bank kamal = new bank(5000);
        System.out.println("Nimal Account balance is : " + nimal.rupees);
        System.out.println("Kamal Account balance is : " + kamal.rupees);

    }
}