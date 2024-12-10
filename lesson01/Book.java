public class Book {
    public String title;
    public String author;
    public int year;
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
        if(this.isAvailable == true) this.isAvailable = false;
    }

    public void returnBook(){
        this.isAvailable = true;
    }

    public void displayInfo(){
        System.out.println("Название: " + this.title + '\n' + "Автор: " + this.author + '\n' + "Год: " + this.year + '\n' + "Доступно: " + this.isAvailable + '\n');
    }
}
