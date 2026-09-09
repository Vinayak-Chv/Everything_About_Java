// Combine data and functions into one unit
package Encapsulation;

class Account {
    // Default access modifier syntax - String name; Normally how we write

    //Accessable to anywhere in the package
    public String name;

    // Accessable to only sub packages
    protected String email;

    // Only accessed within the class
    private String password;

    // Private modifiers are only access through getters and setters
    // Getters
    public String getPassword() {
        return this.password;
    }

    // Setters
    public void setPassword(String pass) {
        this.password = pass;
    }

}

public class Access_Modifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Luffy";
        a1.email = "luffy@kaizoku.com";
        a1.setPassword("abcd");

        System.out.println(a1.getPassword());
    }
}
