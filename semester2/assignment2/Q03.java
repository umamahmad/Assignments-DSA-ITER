package semester2.assignment2;

class Book
{

    int bookId;
    double price;
    int quantity;

    static double totalAmount;

    Book(int bookId, double price, int quantity)
    {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetails()
    {
        System.out.print(bookId+" ");
        System.out.print(price+" ");
        System.out.println(quantity);
    }

    void setTotalAmount()
    {
        totalAmount += (double)price*quantity;

    }


}

public class Q03
{
    public static void main(String[] args)
    {
        Book b1 = new Book(45869,124.2,3);
        b1.displayDetails(); b1.setTotalAmount();
        Book b2 = new Book(23564,198.7,4);
        b2.displayDetails(); b2.setTotalAmount();
        Book b3 = new Book(65891,213.9,1);
        b3.displayDetails(); b3.setTotalAmount();
        Book b4 = new Book(31597,278.9,2);
        b4.displayDetails(); b4.setTotalAmount();
        Book b5 = new Book(74513,315.4,5);
        b5.displayDetails(); b5.setTotalAmount();

        System.out.printf("Total amount spent on books: %.3f%n",Book.totalAmount);


    }
}
