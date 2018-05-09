public class Book {

    private String BookName;
    private String AuthorName;
    private String ISBN;

    public Book() {

        BookName = " ";
        AuthorName = " ";
        ISBN = " ";
    }

    public void setAuthorName(String authorName1) {
        AuthorName = authorName1;

    }
    public void setBookName(String BookName1){
        BookName = BookName1;

    }
    public void setISBN(String ISBN1){
        ISBN = ISBN1;
    }
    public String getAuthorName(){
        return AuthorName;
    }
    public String getBookName(){
        return BookName;
    }
    public String getISBN(){
        return ISBN;
    }
}

