public class Book extends ReadingItem{
    private String author;
    private int year;

    public Book() {
    }

    public Book(String title, double price) {
        super(title, price);
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getName() + "\nAuthor: " 
                + author + "\nYear: " + year + "\nPrice: " + getPrice());
    }
    
}
