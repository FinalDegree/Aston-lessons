public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.year = 0;
        this.isAvailable = true;
    }

    public boolean getIsAvialable() {
        return isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public void borrowBook(){
        if(isAvailable) {
            isAvailable = false;
            System.out.println("Книга взята");
        } else System.out.println("Книга уже занята");
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println("Книга снова доступна");
    }

    public void displayInfo(){
        System.out.println("Название: " + title + '\n' + "Автор: " + author + '\n' + "Год: " + year + '\n' + "Доступно: " + isAvailable + '\n');
    }
}
