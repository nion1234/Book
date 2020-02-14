package com.company;

public class book {
    private String BookName;
    private String BookAuthor;
    private int BookId;
    private String BookType;
    private int BookCopy;
    private static int bookCounter;

    public book(String bookName, String bookAuthor, int bookId, String bookType, int bookCopy) {
        BookName = bookName;
        BookAuthor = bookAuthor;
        BookId = bookId;
        BookType = bookType;
        BookCopy = bookCopy;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public int getBookId() {
        return BookId;
    }

    public String getBookType() {
        return BookType;
    }

    public int getBookCopy() {
        return BookCopy;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public void setBookType(String bookType) {
        BookType = bookType;
    }

    public void setBookCopy(int bookCopy) {
        BookCopy = bookCopy;
    }
    static{
        bookCounter=4000;
    }



    @Override
    public String toString() {
        return "book{" +
                "BookName='" + BookName + '\'' +
                ", BookAuthor='" + BookAuthor + '\'' +
                ", BookId=" + BookId +
                ", BookType='" + BookType + '\'' +
                ", BookCopy=" + BookCopy +
                '}';
    }
    public void showInfo(){
        System.out.println("The Book Name is"+" "+BookName);
        System.out.println("The Book Author is"+" "+BookAuthor);
        System.out.println("The Book Id Is"+" "+BookId);
        System.out.println("The Book type is"+" "+BookType);
        System.out.println("How many copy"+" "+BookCopy);
        System.out.println("Book counting "+" "+bookCounter);
    }
}
