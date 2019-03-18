package task1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a size of books list:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Books firstSet = new Books(size);

        firstSet.addBook(1, "Solaris", "Lem", "Izdatel", 1999, 400, 360);
        System.out.println("All books:");
        firstSet.view();
        firstSet.changePrice(1.5);
        firstSet.searchByAuthor("Lem");
        firstSet.searchAfterYear(2000);
    }
}
