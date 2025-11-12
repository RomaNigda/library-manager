package books;

import java.util.Scanner;

public class Book extends Books{
    static int CountBooks = 0;

    Scanner sc = new Scanner(System.in);

    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    public Book(){
        System.out.println("Enter Serial Number: ");
        this.sNo = sc.nextInt();
        System.out.println("Enter Book Name: ");
        this.bookName = sc.next();
        System.out.println("Enter Author Name: ");
        this.authorName = sc.next();
        System.out.println("Enter Book Qty: ");
        this.bookQty = sc.nextInt();
        this.bookQtyCopy = this.bookQty;
    }

    @Override
    public String toString() {
        return "sNo = " + this.sNo + "\t\tname: " +
                this.bookName + "\tauthor: " +
                this.authorName + "\tquantity: " +
                this.bookQty;
    }
}
