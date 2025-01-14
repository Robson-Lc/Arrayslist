import java.util.Scanner;

public class Usuario {

    private String firstName;
    private String lastName;
    private String fullName;

    public Usuario( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName.toUpperCase();
    }
    public String getFullName(){
        return fullName;
    }


}


