package OOPsBasics;//consder it as bank package


class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class Encapsulation {//consider it as  back class
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name="Vinod college";
        account1.email="vinodcollege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
