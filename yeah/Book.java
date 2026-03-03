package yeah;

import java.util.Scanner;

public class Book {
    public int bookId;
    public String title;
    public String ISBN;
    public String category;
    void setinfo() {

        Scanner bookGet = new Scanner(System.in);

        Book book1 = new Book();

        System.out.println("Enter book ID: ");
        book1.bookId = bookGet.nextInt(); 
        bookGet.nextLine();

        System.out.println("Enter book's title: ");
        book1.title = bookGet.nextLine(); 

        System.out.println("Enter book ISBN: ");
        book1.ISBN = bookGet.nextLine(); 

        System.out.println("Enter book category: ");
        book1.category = bookGet.nextLine(); 

    }

}
