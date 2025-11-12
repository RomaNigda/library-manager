package students;

import books.Book;

import java.util.Arrays;

public class Students {
    private final Student[] students = new Student[50];



    public void addStudent(Student student){
        boolean flag = true;
        if (Student.studentCount > 49){
            System.out.println("Library is full :( ");
            flag = false;
        }

        if (Arrays.asList(students).contains(student)){
            flag = false;
        }

        if (flag){
            students[Student.studentCount] =  student;
            System.out.println("Student added :) ");
            Student.studentCount++;
        }
    }
    public void showAllStudent() {
        if (Student.studentCount == 0){
            System.out.println("Library is empty :( ");
        }
        else {
            for (int i = 0; i < Student.studentCount; i++) {
                System.out.println(students[i].toString());
            }
            System.out.println();
        }
    }

    public void chekIn(Student student, Book book) {
        boolean flag = true;

        if (student.takeBook == 0){
            System.out.println("This student dont have any book :( ");
            flag = false;
        }
        else if (!student.getBook.contains(book)){
            System.out.println("This student dont have this book :( ");
            flag = false;
        }

        if (flag) {
            book.bookQtyCopy++;
            student.takeBook--;
            student.getBook.remove(book);
        }
    }

    public void chekOut(Student student, Book book) {
        boolean flag = true;

        if  (student.takeBook == 3){
            System.out.println("This student already have 3 books :( ");
            flag = false;
        }

        else if (book.bookQtyCopy == 0){
            System.out.println("This book is not in the library :( ");
            flag = false;
        }

        if (flag) {
            book.bookQtyCopy--;
            student.takeBook++;
            student.getBook.add(book);
        }
    }

    public Student getStudent(int regNum){
        for (int i = 0; i < Student.studentCount; i++) {
            if (students[i].regNum == regNum) {
                return students[i];
            }
        }
        return null;
    }


    public void test(Student student){
        student.getInfo();
    }
}
