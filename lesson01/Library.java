public class Library {
    private Book[] books = new Book[100];
    private int booksCount = 0;

    public void addBook(Book book){
        books[booksCount] = book;
        booksCount++;
    }

    public void printAvailableBooks(){
        for(int i = 0; i < booksCount; ++i){
            if(books[i].isAvailable) books[i].displayInfo();
        }
    }

    public void findBooksByAuthor(String author){
         for(int i = 0; i < booksCount; ++i){
            if(books[i].author.equalsIgnoreCase(author)) books[i].displayInfo();
        }
    }
}
