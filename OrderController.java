public class OrderController {

    OrderModel orderModel;
    OrderView orderView;

    public OrderController(OrderModel orderModel, OrderView orderView) {
        this.orderModel = orderModel;
        this.orderView = orderView;
        orderView.setController(this);
    }

    public String additem(OrderItem orderItem) {
        orderModel.Additem(orderItem);
        return orderModel.toString();

    }


    //public void clear
}