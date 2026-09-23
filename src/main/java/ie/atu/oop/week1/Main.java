package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        book firstbook = new book();
        firstbook.title = "dune";
        firstbook.author = "frank herbert";
        firstbook.pageCount =412;

        firstbook.displaydetails();


        }
    }
