public class Magazine extends ReadingItem implements GST_Chargeable{
    private int MonthIssue;
    private int year;

    public Magazine() {
    }

    public Magazine(String title, double price) {
        super(title, price);
    }

    public int getMonthIssue() {
        return MonthIssue;
    }
    public void setMonthIssue(int MonthIssue) {
        this.MonthIssue = MonthIssue;
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
        System.out.println("Magazine: " + getName() + "\nMonthIssue: " 
                + MonthIssue + "\nPrice: " + getPrice());
    }

    @Override
    public double getGSTCharges() {
        return getPrice()*RATE;
    }
    
}
