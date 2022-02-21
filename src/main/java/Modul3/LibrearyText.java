package Modul3;

class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        Reader reader1 = new Reader("Reader#1", 41, 975268888);
        Reader reader2 = new Reader("Reader#2", 35, 633355555);

        library.getReaders().add(reader1);
        library.getReaders().add(reader2);

        Book book1 = new Book("Name#1", "Author#1", 2000);
        Book book2 = new Book("Name#2", "Author#2", 2010);
        Book book3 = new Book("Name#3", "Author#1", 2015);
        Book book4 = new Book("Name#4", "Author#2", 2020);
        Book book5 = new Book("Name#5", "Author#1", 2020);
        Book book6 = new Book("Name#6", "Author#2", 2020);

        library.orderBook(book1, reader1);
        library.orderBook(book2, reader1);
        library.orderBook(book3, reader1);
        library.orderBook(book4, reader1);
        System.out.println("У читача reader1 на руках наступні книги:");
        reader1.printOrderedBooks();
        System.out.print("Кількість ");
        System.out.println(reader1.numberOfOrderedBooks());

        library.orderBook(book4, reader2);
        library.orderBook(book5, reader2);
        System.out.println("У читача reader2 на руках наступні книги:");
        reader2.printOrderedBooks();
        System.out.print("Кількість ");
        System.out.println(reader2.numberOfOrderedBooks());


        System.out.print("Средний вік читачів: ");
        library.printAverageAge();
    }
}

