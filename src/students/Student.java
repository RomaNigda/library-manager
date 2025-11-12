package students;

import books.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    static public int studentCount;

    String name;
    int regNum;

    List<Book> getBook = new ArrayList<>(3);
    public int takeBook = 0;

    Scanner sc = new Scanner(System.in);



    public Student() {
        System.out.println("Enter Student Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter Student Reg No: ");
        this.regNum = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", regNum=" + regNum + '}';
    }

    public void getInfo() {
        for  (Book book : getBook) {
            System.out.println(book.toString());
        }
        System.out.println();
        System.out.println("Book take: " + takeBook);
        System.out.println("---------------");
    }
}
