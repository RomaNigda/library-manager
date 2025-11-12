package main;
import books.*;
import students.*;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        int command;

        Books bo =  new Books();
        Students st = new Students();

        Scanner sc = new Scanner(System.in);

        do{
            Menu.menu();

            System.out.println("Enter command : ");
            command = sc.nextInt();
            sc.nextLine();

            switch (command){
                case 1:
                    System.out.println("Exit :( ");
                    break;
                case 2:
//                    add book
                    Book b = new Book();
                    bo.addBook(b);
                    break;
                case 3:
//                    upgrade quantity
                    bo.upgradeQuantity();
                    break;
                case 4:
//                    search book
                    int a;
                    System.out.println("""
                            1 - by Serial Number
                            2 - by Book Name
                            3 - by Book Author""");

                    a = sc.nextInt();

                    switch (a) {
                        case 1:{
                            System.out.println("Enter Serial Number");
                            bo.searchBookNum(sc.nextInt());
                            break;
                        }
                        case 2:{
                            System.out.println("Enter Book Name");
                            bo.searchBookName(sc.next());
                            break;
                        }
                        case 3:{
                            System.out.println("Enter Author");
                            bo.searchBookAuthor(sc.next());
                            break;
                        }
                        default:{
                            System.out.println("Invalid input");
                        }
                    }
                    break;

                case 5:
//                    show all books
                    bo.showAllBooks();
                    break;
                case 6:
//                    register student
                    Student s = new Student();
                    st.addStudent(s);
                    break;
                case 7:
//                    show students
                    st.showAllStudent();
                    break;
                case 8:
//                    chek out book
                    System.out.println("Enter Student Registration Number");
                    Student s1 = st.getStudent(sc.nextInt());

                    System.out.println("Enter Book Serial Number : ");
                    Book b1 = bo.getBook(sc.nextInt());


                    if (s1 != null && b1 != null) {
                        st.chekOut(s1, b1);
                    }
                    else{
                        System.out.println("Invalid input");
                    }

                    break;
                case 9:
//                    chek-in book
                    System.out.println("Enter Student Registration Number");
                    Student s2 = st.getStudent(sc.nextInt());

                    System.out.println("Enter Book Serial Number : ");
                    Book b2 = bo.getBook(sc.nextInt());


                    if (s2 != null && b2 != null) {
                        st.chekIn(s2, b2);
                    }
                    else{
                        System.out.println("Invalid input");
                    }
                    break;
                case 10:
                    Menu.menu();
                    break;

                case 22:
                    System.out.println("Enter Student Registration Number");
                    Student s3 = st.getStudent(sc.nextInt());

                    st.test(s3);
                    break;


                default:
                    System.out.println("Invalid command");
            }
            sc.nextLine();
        } while(command != 1);
    }

}
