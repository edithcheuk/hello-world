/**
 * The class solution file for question 3 in Week11Day2 in-class quiz.
 * Author: Indika Walimuni
 * Date: 11/02/2020
 * Question #: 3
 Write a Java class to represent a Book as in the context of a library. A book
 has an ISBN number, a title, an author. A book may get checked out or checked
 in depending on the status checked in yes or no.

 Do the following:
 1. Write a class to represent a Book
 2. Write all the getters and setters
 3. implement the toString method
 4. Implement check out and check in operations
 5. In your main program create a book with the status already checked in
 6. Checkout this book and verify the status
 7. pload your Book class class here
 */
/**
 * This class represents a book as interpreted by a library.
 */

package Week17Day1;

public class Book {
    // Instance data
    int isbn;
    String title;
    String author = "indika";
    boolean checkedinStatus;


    // Constructors
    public Book() { // Default constructor
        System.out.println("You called the supper class ");
    }

    public Book(int isbn, String title, String author) { // Constructor
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.checkedinStatus = true; // By default when a library creates a book it
        // is not checked out = checked in status = true
    }

    // getters or accessors
    public int getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getCheckinStatus() {
        return this.checkedinStatus;
    }

    // Setters or mutators
    public void setCheckedinStatus(boolean newCheckinStatus) {
        this.checkedinStatus = newCheckinStatus;
        System.out.println("");
    }
    /**
     * Check out a book to a patron and change the status change the checkedinStatus
     * status to false
     * @return a message String
     */
   public String checkOut(){
        if (this.checkedinStatus == true){ // can only checkout a book that is in the
            // library
            this.checkedinStatus = false; // Its is being checked out
            return "Your book is ready";
        }
        else
            return "Sorry this book has been checked out"; // Already checked out
   }

    /**
     * Check in a book and change the checkedinStatus status to true
     */
    public void checkIn(){ //
        this.checkedinStatus = true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", checkedinStatus=" + checkedinStatus +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Book{" +
//                "isbn=" + isbn +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", checkedinStatus=" + checkedinStatus +
//                '}';
//    }
}
