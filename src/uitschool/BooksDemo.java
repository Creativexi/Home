package uitschool ;

public class BooksDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Printable[] books = new Printable[2];
        books[0] = book1;
        books[1] = book2;
        for (Printable x: books){
            x.print() ;
        }
    }
}
