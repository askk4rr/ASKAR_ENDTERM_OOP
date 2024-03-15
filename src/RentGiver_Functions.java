import java.sql.Connection;

public class RentGiver_Functions{
    DBFunctions db = new DBFunctions();
    DBFunctions_RentGiver dbrg = new DBFunctions_RentGiver();
    Connection con = db.connect_to_db("MadiDake", "postgres", "w6Yh7OHK2lxxA");
    public void items(String item, String description, float price){
        dbrg.create_table_RentGiver(con,"Items");
        dbrg.add_table_RentGiver(con, "Items", item, description, price);
    }
    public void item_update(String item, String new_description, float new_price){
        dbrg.update_table_RentGiver(con, "Items", item, new_description, new_price);
    }
    public void view_items(){
        dbrg.read_data_items(con, "Items");
    }
    public void item_delete(String id){
        dbrg.delete_row_by_Item(con, "Items", id);
    }
}
