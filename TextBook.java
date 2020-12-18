package Week17Day1;

public class TextBook extends Book {
    String subject;

    public TextBook(){

    }

    public void testMethod(){
        System.out.println("Testing access package private data: " + isbn);
        System.out.println(toString());
    }

    public void setCheckedinStatus(boolean newCheckinStatus) {
        this.checkedinStatus = newCheckinStatus;
        System.out.println("");
    }

    public String checkOut(){
        if (this.checkedinStatus == true){ // can only checkout a book that is in the
            // library
            this.checkedinStatus = false; // Its is being checked out
            return "Your book is ready. But its due in 10 days.";
        }
        else
            return "Sorry this book has been checked out"; // Already checked out
    }


}
