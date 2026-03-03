package Group_4_Base_5_module3_exercise_3_2_methodsAndWithoutParameters;

import java.util.Scanner;

public class Book {
    public int bookId;
    public String title;
    public String ISBN;
    public String category;
    void setinfo() {

        Scanner bookGet = new Scanner(System.in);

        System.out.print("Enter book ID: ");
        this.bookId = bookGet.nextInt(); 
        bookGet.nextLine();

        System.out.print("Enter book's title: ");
        this.title = bookGet.nextLine(); 

        System.out.print("Enter book ISBN: ");
        this.ISBN = bookGet.nextLine(); 

        System.out.print("Enter book category: ");
        this.category = bookGet.nextLine(); 

    }

}
