public class Product implements OrderItem{

   String itemName;
   double price;

   public Product(String itemName, double price) {
       this.itemName = itemName;
       this.price = price;
   }
    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
