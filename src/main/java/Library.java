import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> library;

    public Library(String name) {
        this.library = new ArrayList<Book>();
        this.name = name;
    }

    public int bookCount(){
        return library.size();
    }

    public void add(Book book){
        library.add(book);
    }

}
