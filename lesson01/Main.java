

public class Main{
    public static void main(String[] args){
        Book book6 = new Book("Милый друг", "Ги де Мопассан", 1885, true);
        Book book7 = new Book("Колыбель для кошки", "Курт Воннегут", 1963, true);
        Book book8 = new Book("Атлантида под водой", "Ренэ Каду");
        Book book9 = new Book("Тысяча дюжин", "Джек Лондон", 1904, true);
        Book book10 = new Book("Том Сойер за границей", "Марк Твен");

        Library.addBook(book6);
        Library.addBook(book7);
        Library.addBook(book8);
        Library.addBook(book9);
        Library.addBook(book10);
        
        Library library = new Library();
        library.printAvailableBooks();

        book10.borrowBook();
        library.printAvailableBooks();
    }
}