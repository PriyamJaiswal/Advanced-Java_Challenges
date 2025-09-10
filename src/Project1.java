
class Book {

    static int totalNoOfBooks;

    String title;

    String author;

    String isbn;  // book number

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {// Object Initializer
        totalNoOfBooks++;
    }

      Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

     Book(String isbn){
        this( isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title );
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        }else {
            System.out.println("This book is already in the Library");
        }
    }

    public static  void main(String[] args) {
        Book originOfHuman = new Book("1", "Design" , "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        originOfHuman.borrowBook();
        myBook.borrowBook();
        originOfHuman.borrowBook();
        originOfHuman.returnBook();
        myBook.returnBook();
        originOfHuman.returnBook();
    }

}
