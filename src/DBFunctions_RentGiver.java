import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBFunctions_RentGiver implements  RentGiver_func_create, RentGiver_func_add, RentGiver_func_update, RentGiver_func_read, RentGiver_func_delete{
    DBFunctions db = new DBFunctions();
    Connection con = db.connect_to_db("MadiDake", "postgres", "w6Yh7OHK2lxxA");
    public void create_table_RentGiver(Connection con, String Item_table){
        Statement st;
        try{
            String query = "create table if not exists " + Item_table + "(id SERIAL, item varchar(200), description varchar(200), price varchar(200000), primary key(id));";
            st = con.createStatement();
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void add_table_RentGiver(Connection con, String Item_table, String item, String description, float price){
        Statement st;
        try{
            String query = String.format("insert into %s(item, description, price) values('%s','%s','%s')", Item_table, item, description, price);
            st = con.createStatement();
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void update_table_RentGiver(Connection con, String Item_table, String item, String new_description, float new_price){
        Statement st;
        try{
            String query = String.format("update %s set description = '%s', price = '%s' where item='%s'", Item_table, new_description, new_price, item);
            st = con.createStatement();
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void read_data_items(Connection con, String item_table){
        Statement st;
        ResultSet rs;
        try{
            String query = String.format("select * from %s", item_table);
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("id")+ " " +rs.getString("item")+ " " +rs.getString("description")+ " $" +rs.getDouble("price"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void delete_row_by_Item(Connection con, String item_table, String id){
        Statement st;
        try{
            String query = String.format("delete from %s where id='%s'", item_table, id);
            st = con.createStatement();
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
