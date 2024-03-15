import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBFunctions_Rent implements Rent_fuc_create, Rent_func_add, Rent_func_read, Rent_func_delete{
    public void create_table_Rent(Connection con, String rent_table) {
        Statement st;
        try {
            String query = "create table if not exists " + rent_table + "(id SERIAL, item varchar(200), description varchar(200), price varchar(200000), primary key(id));";
            st = con.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void add_table_Rent(Connection con, String Rents, String item, String description, float price) {
        Statement st;
        try {
            String query = String.format("insert into %s(item, description, price) values('%s','%s','%s')", Rents, item, description, price);
            st = con.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void read_data_rents(Connection con, String Rents){
        Statement st;
        ResultSet rs;
        try{
            String query = String.format("select * from %s", Rents);
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
    public void delete_row_by_Rent(Connection con, String Rents, String id){
        Statement st;
        try{
            String query = String.format("delete from %s where id='%s'", Rents, id);
            st = con.createStatement();
            st.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
