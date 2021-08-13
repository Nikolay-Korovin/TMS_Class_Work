package Unit7.Task1;

import java.time.LocalDate;

public class Reader {
    String name;
    String surName;
    String patronymic;
    final int readerTicket;
    String faculty;
    final LocalDate birthday;
    int phoneNumber;

    Reader(int readerTicket, int year, int month, int day){
        this.readerTicket = readerTicket;
        this.birthday = LocalDate.of(year,month,day);
    }
    Reader(String name, String surName, String patronymic,int readerTicket,String faculty, int year, int month, int day, int phoneNumber){
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.birthday = LocalDate.of(year,month,day);
    }

    void takeBook(int numberOfBooks){
        System.out.println(this.name + " взял " + numberOfBooks + " книги.");
    }

    void takeBook(String...numberOfBooks){
        System.out.print(this.name + " взял книги: ");
        for (int i = 0; i < numberOfBooks.length; i++) {
            System.out.print(numberOfBooks[i] + " ");
        }
        System.out.println();
    }

    void takeBook(Book...books){
        System.out.print(this.name + " взял книги: " );
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName() + " ");
        }
        System.out.println();
    }

    void returnBook(int numberOfBooks){
        System.out.println(this.name + " Вернул " + numberOfBooks + " книги.");
    }

    void returnBook(String...numberOfBooks){
        System.out.print(this.name + " вернул книги: ");
        for (int i = 0; i < numberOfBooks.length; i++) {
            System.out.print(numberOfBooks[i] + " ");
        }
        System.out.println();
    }

    void returnBook(Book...books){
        System.out.print(this.name + " вернул книги: " );
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName() + " ");
        }
        System.out.println();
    }

}
