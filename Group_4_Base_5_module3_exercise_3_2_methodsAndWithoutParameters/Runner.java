package Group_4_Base_5_module3_exercise_3_2_methodsAndWithoutParameters;
 /* Lastname, Firstname
        ITE 012-CS12S4
        March 2, 2026
        Topic:Application of Methods with and without Parameters */

public class Runner {
    public static void main(String [] args){
            Book book1 = new Book();

    Author author1 = new Author();

    Borrower borrower1 = new Borrower();

    System.out.println("\n ----Book Information----");
    book1.setinfo();

    author1.setinfo(101, "LeBron", "James");

    borrower1.setborrower(209);
    borrower1.setfirstName("Lebron");
    borrower1.setlastname("James");


    System.out.println("\n ----Registration Receipt----");
    System.out.println("Book Title:" + book1.title);
    System.out.println("Author:" + author1.lastName +" "+ author1.firstName );
    System.out.println("Borrower:" + borrower1.getfirstname() + " " + borrower1.getlastName() + "\n");

    }

}
