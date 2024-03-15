public class Person{
    String name;
    String surname;
    int money;
    public Person(String name, String surname, int money){
        setName(name);
        setSurname(surname);
        setMoney(money);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
}
