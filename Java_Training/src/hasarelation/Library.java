package hasarelation;

public class Library {
	private Book[] book=new Book[4];
	int i=0;
	//helper method
	void addBook(Book b) {
		if(i<book.length) {
			book[i]=b;
			i++;
		}else {
			System.out.println("Index is not present");
		}
	}
	
	//getter
	Book[] getBook() {
		return book;
	}
	public static void main(String[] args) {

	}

}
