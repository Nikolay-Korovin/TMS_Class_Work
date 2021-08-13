package Unit7.Task1;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Василий", "Иванович", "Козлов", 100500,"Fkp", 1993,11,01,2478924);
        Book book = new Book("Война и мир" , "Толстой");
        Book book2 = new Book("Война и мир2" , "Толстой");
        Book book3 = new Book("Война и мир3" , "Толстой");
        Book book4 = new Book("Война и мир4" , "Толстой");
        Reader[] readers = new Reader[]{new Reader(12,1900,12,1), new Reader(11,1950,11,5), new Reader(10,2000,5,1)};
        Book[] books = new Book[]{book,book2,book3,book4};

        reader.returnBook(books);
        reader.returnBook(new Book("space", "niel"), new Book("harrypotter", "rowling"));
        reader.returnBook(3);
        reader.returnBook("harrypotter","somebook");

    }
}
