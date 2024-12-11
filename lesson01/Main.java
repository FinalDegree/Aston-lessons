

public class Main{

    static Library library = new Library(); 

    static {  
        library.addBook(new Book("Сердца трёх", "Джек Лондон", 1918, true));
        library.addBook(new Book("Приключения Тома Сойера", "Марк Твен", 1876, true));
        library.addBook(new Book("Маракотова бездна", "Артур Конан Дойл"));
        library.addBook(new Book("Позолоченный век", "Марк Твен", 1873, true));
        library.addBook(new Book("Приключения Гекльберри Финна", "Марк Твен"));
    }

    public static void main(String[] args){

        Book book6 = new Book("Милый друг", "Ги де Мопассан", 1885, true);
        Book book7 = new Book("Колыбель для кошки", "Курт Воннегут", 1963, true);
        Book book8 = new Book("Атлантида под водой", "Ренэ Каду");
        Book book9 = new Book("Тысяча дюжин", "Джек Лондон", 1904, true);
        Book book10 = new Book("Том Сойер за границей", "Марк Твен");

        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        //Library anotherLib = new Library();
        //anotherLib.addBook(new Book("Приключения Гекльберри Финна", "Марк Твен"));
        //anotherLib.printAvailableBooks();
        //library.findBooksByAuthor("МАРК ТВЕН");
        
        library.printAvailableBooks();
        book10.borrowBook();
    }
}