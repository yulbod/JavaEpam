package task1;

public class Books {
    Book[] massBooks;
    int number = 0;

    public Books(int size) {
        massBooks = new Book[size];
    }

    public void addBook(int id, String name, String author, String publishing, int yearOfPublish, int qtyOfPages, float price){
        if (number <= massBooks.length-1) {
            massBooks[number] = new Book(id, name, author, publishing, yearOfPublish, qtyOfPages, price);
            number++;
        } else System.out.println("You have no space in your books set!");
    }

    public void view(){
        for (Book book : massBooks) {
            if (book != null) book.view();
        }
    }

    public void changePrice(double percent){
        for (Book book: massBooks) {
            if (book != null) book.setPrice((float)(book.getPrice()*percent));
        }
    }

    public Books searchByAuthor(String sAuthor){
        System.out.println("There is a list of found books, written by author " + sAuthor + ":");
        Books result = new Books(massBooks.length);
        for (Book book: massBooks) {
            if (book !=null && sAuthor.equalsIgnoreCase(book.getAuthor()))
                result.addBook(book.getId(),book.getName(), book.getAuthor(), book.getPublishing(), book.getYearOfPublish(), book.getQtyOfPages(), book.getPrice());
        }
        return result;
    }

    public Books searchAfterYear(int sYear){
        System.out.println("There is a list of found books, published after " + sYear + " year:");
        System.out.println("length = " + massBooks.length);
        Books result = new Books(massBooks.length);
        for (Book book: massBooks) {
            if (book != null && book.getYearOfPublish() > sYear){
                result.addBook(book.getId(),book.getName(), book.getAuthor(), book.getPublishing(), book.getYearOfPublish(), book.getQtyOfPages(), book.getPrice());
            }
        }
        return result;
    }


}
