class Book {
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    Book(String title,String author){
        this.title = title;
        this.author = author;
        this.price = 100;

    }
    public static void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("java ", "salim", 150);
        Book book2 = new Book("python ", "mohammed");
        book1.displayInfo();
        book2.displayInfo();
    }
}