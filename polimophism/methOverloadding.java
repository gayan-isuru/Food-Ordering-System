package polimophism;

class methOverloadding {
    void meth() {
        System.out.println("This is method 1");
    }

    void meth(int x) {
        System.out.println("This is method 2 = " + x);
    }

    void meth(int y, int z) {
        System.out.println("This is method 3 = " + (y + z));
    }

    public static void main(String[] args) {
        methOverloadding obj = new methOverloadding();
        obj.meth();
        obj.meth(5);
        obj.meth(1, 6);
    }

}