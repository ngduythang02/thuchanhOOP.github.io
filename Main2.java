import java.util.jar.Attributes.Name;

class Item{
  private String name;
  private double price;
  private double discount;
  public Item(String name, double price, double discount){
    this.name=name;
    this.price=price;
    this.discount=discount;
  }
  public String getName(){
      return name;
    }
  public double getPrice(){
    return price;
  }
  public double getDiscount(){
      return discount;
    }
  public String toString(){
    return name + price + discount;
  }
}

class Employee extends Item{
  public Employee(String name, double price, double discount){
    super(name,price,discount);
  }
  public String getName(){
    return super.getName();
  }
}


class GroceryBill{
  private Employee clerk;
  private Item[] receipt;
  private double total;

  public GroceryBill(Employee clerk){
    this.clerk=clerk;
  }
  public void add(Item i){
    
  }
}

class DiscountBill{
  private double discountAmount;

}


public class Main2 {
  public static void main(String[] args) {
    System.out.println("Hello world");
  }
}