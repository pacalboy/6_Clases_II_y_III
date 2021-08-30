public class Customer {
    private final String customerName;
    private double totalPay;
    private ReadingItem item;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalPay() {
        return totalPay;
    }
       
    public void buy(ReadingItem item){
        totalPay += item.getPrice();
    }

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + customerName + ", totalPay=" +
                totalPay + ", item=" + item + '}';
    }
    
}
