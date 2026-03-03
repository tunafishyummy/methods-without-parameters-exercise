package Group_4_Base_5_module3_exercise_3_2_methodsAndWithoutParameters;
public class Borrower {
    public int borrowerId;
    public String lastName;
    public String firstName;

    public void setborrower(int id){
        this.borrowerId = id;
    }

    public void setlastname(String ln){
        this.lastName = ln;
    }

    public void setfirstName(String fn){
        this.firstName = fn;
    }

    public int getborrowerId(){
        return borrowerId;
    }

    public String getlastName(){
        return lastName;
    }

    public String getfirstname(){
        return firstName;
    }
    

}
