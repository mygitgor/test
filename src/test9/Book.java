package test9;

public class Book {
    private int id;
    private String title;
    private String[] authors;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String bindingType;


    public Book(int id, String title, String[] authors, String publisher, int year, int pageCount, double price,
            String bindingType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "book id =" +id +" title ="+ title+" authors ="+ authors+" publisher ="+ publisher+
             " year = "+year+" pageCount ="+ pageCount+" price = "+price+" bindingType ="+ bindingType;
    }
    
}

class Bookstore{
    private Book[] books;
    private int size;

    public Bookstore(int capacity){
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book){
        if(size < books.length){
            books[size] = book;
            size++;
        }else {
            System.out.println("Ошибка: книжный магазин заполнен.");
        }
    }

    public void printBooksByAuthor(String author){
        for (int i = 0; i < size; i++) {
            String[] authors = books[i].getAuthors();
            if(containsAuthor(authors, author)){
                System.out.println(books[i]);
            }
        }
    }

    private boolean containsAuthor(String[] authors, String author){
        for(String a : authors){
            if(a.equalsIgnoreCase(author)){
                return true;
            }
        }
        return false;
    }

    public void printBooksByPublisher(String publisher){
        System.out.println("Список книг издательства " + publisher + ":");
        for (int i = 0; i < size; i++) {
            String bookPublisher = books[i].getPublisher();
            if(bookPublisher.equalsIgnoreCase(bookPublisher)){
                System.out.println(books[i]);
            }
        }
    }

    public void printBooksPublishedAfterYear(int year){
        System.out.println("Список книг, выпущенных после " + year + " года:");
        for (int i = 0; i < size; i++) {
            int bookYear = books[i].getYear();
            if(bookYear > year){
                System.out.println(books[i]);
            }
        }
    }
    
}

class Test{
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore(5);

        String[] authors1 = {"John Smith"};
        String[] authors2 = {"Alice Johnson"};
        String[] authors3 = {"Bob Thompson"};

        Book book1 = new Book(1, "Book Title 1", authors1, "Publisher A", 2010, 200, 29.99, "Hardcover");
        Book book2 = new Book(2, "Book Title 2", authors2, "Publisher B", 2015, 150, 19.99, "Paperback");
        Book book3 = new Book(3, "Book Title 3", authors3, "Publisher A", 2020, 250, 34.99, "Hardcover");

        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);

        String searchAuthor = "John Smith";
        bookstore.printBooksByAuthor(searchAuthor);
    }
}