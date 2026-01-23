package hasarelation;

public class Task2Lib {
    private Task2Book[] books;

    public Task2Lib() {
        this.books = new Task2Book[3];
        
        books[0] = new Task2Book("Java Programming");
        books[1] = new Task2Book("Data Structures");
        books[2] = new Task2Book("Algorithm Design");
    }

    public void listBooks() {
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}