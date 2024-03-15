public class RentSystem{
    String id;
    String item;
    String description;
    float price;
    public RentSystem(String id, String item, String description, float price){
        setId(id);
        setItem(item);
        setDescription(description);
        setPrice(price);
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setItem(String item){
        this.item = item;
    }
    public String getItem(){
        return item;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }

}
