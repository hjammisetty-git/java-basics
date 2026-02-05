class Mobile {
    String brand;
    int price;

    void display() {
        System.out.println(brand + " costs " + price);
    }
}

public class ObjectsDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 30000;
        m1.display();
    }
}
