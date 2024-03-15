public class RentSeeker extends Person{
    String status;
    public RentSeeker(String name, String surname, int money, String status){
        super(name, surname, money);
        setStatus(status);
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
