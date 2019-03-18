package task1;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        System.out.println("Enter a size of books list:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Books firstSet = new Books(size);

        firstSet.addBook(1, "Solaris", "Lem", "Izdatel", 1999, 400, 560);
        firstSet.addBook(2, "ris", "Mem", "el", 1999, 400, 360);
        firstSet.addBook(5, "Solaris", "Lem", "Izdatel", 2999, 400, 360);
        System.out.println("All books:");
        firstSet.view();
        changeAllPrices(firstSet);
        searchAuthor(firstSet);
        searchYear(firstSet);

    }

    public static void changeAllPrices(Books record){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percent to change a price (<1 to decrease, >1 to increase):");
        float percent = scan.nextFloat();
        record.changePrice(percent);
        System.out.println("Prices of all books is changed.");
    }

    public static void searchAuthor(Books record){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an author for searching:");
        String author = scan.nextLine();
        Books result = record.searchByAuthor(author);
        result.view();
    }

    public static void searchYear(Books record){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year for searching books published after this year:");
        int year = scan.nextInt();
        Books result = record.searchAfterYear(year);
        result.view();
    }
}
