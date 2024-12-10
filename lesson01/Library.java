public class Library {
    private static Book[] books;
    private static int booksCount = 0;

    static {
        books = new Book[100];
        addBook(new Book("Сердца трёх", "Джек Лондон", 1918, true));
        addBook(new Book("Приключения Тома Сойера", "Марк Твен", 1876, true));
        addBook(new Book("Маракотова бездна", "Артур Конан Дойл"));
        addBook(new Book("Позолоченный век", "Марк Твен", 1873, true));
        addBook(new Book("Приключения Гекльберри Финна", "Марк Твен"));
    }

    public static void addBook(Book book){
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
