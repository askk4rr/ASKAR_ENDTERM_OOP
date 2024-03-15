public class RentGiver extends Person{
    String email;
    public RentGiver(String name, String surname, int money){
        super(name, surname, money);
        this.email = name + "." + surname + "@company.com";
    }
    public String getEmail(){
        return this.email = name + "." + surname + "@company.com";
    }
}
