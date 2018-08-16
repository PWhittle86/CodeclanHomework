import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book_collection;
    private int capacity;

    Library(){
        this.book_collection = new ArrayList<Book>();
        this.capacity = 10;
    }

    public int bookCount(){
        return this.book_collection.size();
    }

    public void addBook(Book book_to_add){
        if (this.capacity >= 1)
            {this.book_collection.add(book_to_add); this.capacity -= 1;}
        else
            {System.out.println("Sorry, the library is full.");}
    }

    public int checkCapacity(){
        return this.capacity;
    }


}
