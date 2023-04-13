public class Main {
    public static void main(String[] args) {

        Product product = new Product("Item Name", 15);

        OrderModel order = new OrderModel();

        order.Additem(product);

        System.out.println(order.toString());

    }
}

