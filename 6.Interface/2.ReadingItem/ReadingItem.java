public abstract class ReadingItem {
    private String title;
    private double price;

    public ReadingItem() {
    }

    public ReadingItem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getName() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    
    abstract public double calculatePrice();
    
    abstract public void displayInfo();

    
    
    
    
}
