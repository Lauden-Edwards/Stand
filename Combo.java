import java.util.ArrayList;

public class Combo extends Product implements OrderItem{

   ArrayList<OrderItem> item = new ArrayList<OrderItem>();

    public Combo(String itemName, double price) {
        super(itemName, price);
    }

    void Additem(OrderItem newItem) {
    item.add(newItem);
    }

    @Override
    public String getItemName() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
