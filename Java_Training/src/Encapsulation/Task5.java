package Encapsulation;

public class Task5 {
		private int availableBooks;

	    public void setAvailableBooks(int availableBooks) {
	        if (availableBooks >= 0) {
	            this.availableBooks = availableBooks;
	        }
	    }

	    public int getAvailableBooks() {
	        return availableBooks;
	    }

	    public static void main(String[] args) {
	       
	    }

}
