package Q1;

public class Book extends LibraryItem implements LoanItem
{
    String author;
    String title;
    int numPages;
    public Book(String author, String title, int numPages,String type,String ID)
    {
        super(type,ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    @Override
    public double calculatePrice()
    {
        return numPages*0.5;//the price goes up by 5 cents per page? i dont know how books are priced
    }
}
