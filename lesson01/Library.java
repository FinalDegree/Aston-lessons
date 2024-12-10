public class Library {
    private static Book[] books = new Book[100];
    private static int booksCount = 0;

    static {
        Library library = new Library();
        library.addBook(new Book("Сердца трёх", "Джек Лондон", 1918, true));
        library.addBook(new Book("Приключения Тома Сойера", "Марк Твен", 1876, true));
        library.addBook(new Book("Маракотова бездна", "Артур Конан Дойл"));
        library.addBook(new Book("Позолоченный век", "Марк Твен", 1873, true));
        library.addBook(new Book("Приключения Гекльберри Финна", "Марк Твен"));
    }

    public void addBook(Book book){
        books[booksCount] = book;
        booksCount++;
    }

    public void printAvailableBooks(){
        for(int i = 0; i < booksCount; ++i){
            if(books[i].isAvailable == true) books[i].displayInfo();
        }
    }

    public void findBooksByAuthor(String author){
        for(int i = 0; i < booksCount; ++i){
            if(books[i].author == author) books[i].displayInfo();
        }
    }
}