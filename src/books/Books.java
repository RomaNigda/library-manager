package books;

import java.util.Scanner;

public class Books {
    private final Book[] books =  new Book[50];

    Scanner sc = new Scanner(System.in);

    public void addBook(Book book) {
        boolean flag = true;
        if (Book.CountBooks > 49){
            System.out.println("Library is full :( ");
            flag = false;
        }

        if (inLibrary(book.sNo)){
            System.out.println("this book is already in library :( ");
            flag = false;
        }

        if (flag) {
            System.out.println("correct appending the book ");
            books[Book.CountBooks] = book;
            Book.CountBooks++;
        }
    }

    public void upgradeQuantity() {

        System.out.println("Please enter the book serial number: ");
        int serialNumber = sc.nextInt();
        
        for  (int i = 0; i < Book.CountBooks; i++) {
            if (serialNumber == books[i].sNo){
                System.out.println("Enter book quantity to add: ");
                int quantity = sc.nextInt();
                books[i].bookQty += quantity;
                books[i].bookQtyCopy += quantity;
                System.out.println("Upgrade is successful");
            }
            else{
                System.out.println("incorrect book serial number");
            }
        }
    }

    public void showAllBooks() {
        if (Book.CountBooks == 0){
            System.out.println("Library is empty :( ");
        }
        else {
            for (int i = 0; i < Book.CountBooks; i++) {
                System.out.println(books[i].toString());
            }
            System.out.println();
        }
    }

    public void searchBookNum(int serialNumber) {
        boolean flag = false;
        for (int i = 0; i < Book.CountBooks; i++) {
            if (serialNumber == books[i].sNo){
                System.out.println(books[i].toString());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Invalid serial number");
        }
    }

    public void searchBookName(String bookName) {
        boolean flag = false;
        String name = bookName.replaceAll("\\s", " ").toLowerCase();
        for (int i = 0; i < Book.CountBooks; i++) {
            if (name.equals(books[i].bookName
                    .replaceAll("\\s", " ")
                    .toLowerCase() ))
            {
                System.out.println(books[i].toString());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Invalid book name");
        }
    }

    public void searchBookAuthor(String bookAuthor) {
        boolean flag = false;
        String author = bookAuthor.replaceAll("\\s", " ").toLowerCase();
        for (int i = 0; i < Book.CountBooks; i++) {
            if (author.equals(books[i].authorName
                    .replaceAll("\\s", " ")
                    .toLowerCase() ))
            {
                System.out.println(books[i].toString());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Invalid book name");
        }
    }

    public Book getBook(int serialNumber) {
        for (int i = 0; i < Book.CountBooks; i++) {
            if (serialNumber == books[i].sNo){
                return books[i];
            }
        }
        return null;
    }

    boolean inLibrary(int serialNumber) {
        boolean flag = false;
        for (int i = 0; i < Book.CountBooks; i++) {
            if (serialNumber == books[i].sNo) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
