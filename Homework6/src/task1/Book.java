package task1;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishing;
    private int yearOfPublish;
    private int qtyOfPages;
    private float price;

    public Book() {
    }

    public Book(int id, String name, String author, String publishing, int yearOfPublish, int qtyOfPages, float price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.yearOfPublish = yearOfPublish;
        this.qtyOfPages = qtyOfPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getQtyOfPages() {
        return qtyOfPages;
    }

    public void setQtyOfPages(int qtyOfPages) {
        this.qtyOfPages = qtyOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void view(){
        System.out.println("\nID:" + id +
                "\nBook: " + name +
                "\nAuthor: " + author +
                "\nPublishing office: " + publishing +
                "\nYear of publish: " + yearOfPublish +
                "\nQuantity of pages: " + qtyOfPages +
                "\nPrice: " + price + "\n");

    }
}

