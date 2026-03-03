package Group_4_Base_5_module3_exercise_3_2_methodsAndWithoutParameters;
import java.util.Scanner;
public class Author {
    public int authorId;
    public String lastName;
    public String firstName;
    void setinfo(int authorId, String lastName, String firstName) {
        Scanner authorGet = new Scanner(System.in);

        Author author1 = new Author();

        System.out.println("Enter author ID: ");
        author1.authorId = authorGet.nextInt(); 
        authorGet.nextLine();

        System.out.println("Enter author's last name: ");
        author1.lastName = authorGet.nextLine(); 

        System.out.println("Enter author's first name: ");
        author1.firstName = authorGet.nextLine(); 
}
}