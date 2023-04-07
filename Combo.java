import java.util.ArrayList;

public class Combo implements OrderItem{

   ArrayList<OrderItem> item = new ArrayList<OrderItem>();

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
