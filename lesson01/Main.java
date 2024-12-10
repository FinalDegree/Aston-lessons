

public class Main{
    public static void main(String[] args){
        Book book6 = new Book("Милый друг", "Ги де Мопассан", 1885, true);
        Book book7 = new Book("Колыбель для кошки", "Курт Воннегут", 1963, true);
        Book book8 = new Book("Атлантида под водой", "Ренэ Каду");
        Book book9 = new Book("Тысяча дюжин", "Джек Лондон", 1904, true);
        Book book10 = new Book("Том Сойер за границей", "Марк Твен");

        Library library = new Library();
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        library.printAvailableBooks();
        
        book10.borrowBook();
        library.printAvailableBooks();
    }
}