package ie.atu.oop.week1;

public class book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available =  true;

    public void displaydetails()
    {
        System.out.println("book title: " + title);
        System.out.println("book author: " + author);
        System.out.println("book page count: " + pageCount);
        System.out.println("book available: " + available);
    }
    }


