package ie.atu.oop.week1;

import java.awt.print.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

        book firstbook = new book();
        firstbook.title = "dune";
        firstbook.author = "frank herbert";
        firstbook.pageCount =412;

        //before loan
        firstbook.displaydetails();
        firstbook.borrowBook();
        //after loan
        firstbook.displaydetails();

        Book secondBook = createBook("Clean Code", "Dan Williams",223);
        Book thirdBook = createBook("Another Book Code", "John Murphy",333);
        Book FourthBook = createBook("Student Life", "Mary Shelly", 442);

        secondBook.displayDetails();
        System.out.println("\n");
        thirdBook.displayDetails();
        System.out.println("\n");
        fourthBook.displayDetails();


        }
        private static Book createBook(String title, String author, int pageCount)
        {
            Book book = new Book();
            book.title  = title;
            book.author = author;
            book.pageCount = pageCount;
            return book;
        }

    }
