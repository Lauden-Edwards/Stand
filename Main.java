import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        OrderModel order = new OrderModel();

        System.out.println(order.toString());

        OrderView Orderview = new OrderView();
        OrderController OC = new OrderController(order, Orderview);
        JFrame Jframe = new JFrame("Hamburger Stand");
        Jframe.setVisible(true);
        Jframe.getContentPane().add(Orderview);
        Jframe.pack();


    }
}

