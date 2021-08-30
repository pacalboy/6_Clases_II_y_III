public class Encyclopedia extends ReadingItem implements GST_Chargeable{
    private int year;

    public Encyclopedia() {
    }

    public Encyclopedia(String title, double price) {
        super(title, price);
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public double calculatePrice() {
        return getPrice()+getGSTCharges();
    }

    @Override
    public void displayInfo() {
        System.out.println("Encyclopedia: " + getName() + "\nYear: " 
                + year + "\nPrice: " + getPrice());
    }

    @Override
    public double getGSTCharges() {
        return getPrice()*RATE;
    }
    
}
