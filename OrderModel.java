import java.util.ArrayList;

public class OrderModel {

    int TOTAL;
    private double total;
    ArrayList<OrderItem> Order = new ArrayList<OrderItem>();

    public OrderModel() {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    void Additem(OrderItem newItem) {
        Order.add(newItem);
    }

    void clear() {
        Order.clear();
    }

    public String toString() {
        String orderList = "Here is your order:";
        for (OrderItem orderItem : Order) {
            orderList += "\n" + orderItem.getItemName() + " " + orderItem.getPrice();
        }
        return orderList;
    }
}
