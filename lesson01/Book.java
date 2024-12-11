public class Book {
    private String title;
    public String author;
    private int year;
    public boolean isAvailable;

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

    public void borrowBook(){
        if(isAvailable) isAvailable = false;
        else System.out.println("Книга уже занята");
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println("Книга снова доступна");
    }

    public void displayInfo(){
        System.out.println("Название: " + title + '\n' + "Автор: " + author + '\n' + "Год: " + year + '\n' + "Доступно: " + isAvailable + '\n');
    }
}
