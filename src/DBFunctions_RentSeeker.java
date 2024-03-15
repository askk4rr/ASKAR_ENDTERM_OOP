import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBFunctions_RentSeeker implements RentSeeker_func_order{
    public void rent_item(Connection con, String item_table, String id){
        Statement st;
        ResultSet rs;
        try{
            String query = String.format("select * from %s where id='%s'", item_table, id);
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                String rent_id = rs.getString("id");
                String rent_item = rs.getString("item");
                String rent_description = rs.getString("description");
                float rent_price = rs.getFloat("price");
                RentSystem rss = new RentSystem(rent_id, rent_item, rent_description, rent_price);
                DBFunctions_Rent rn = new DBFunctions_Rent();
                rn.add_table_Rent(con, "Rents", rent_item, rent_description, rent_price);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

