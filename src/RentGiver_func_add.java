import java.sql.Connection;

public interface RentGiver_func_add{
    public void add_table_RentGiver(Connection con, String Item_table, String item, String description, float price);
}
