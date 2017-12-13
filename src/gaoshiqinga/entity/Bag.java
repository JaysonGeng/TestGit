package gaoshiqinga.entity;

import java.util.ArrayList;

public class Bag {

    private int id;
    private int BookId=1;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<Book> books =new ArrayList<Book>();

    public void addBook(Book book){
        book.setId(BookId);
        BookId++;
        books.add(book);
    }

    public String getBookList(){
        String s="";
        for (Book b:books) {

            s=s+b+"\n";
        }
        return s;
    }
}
