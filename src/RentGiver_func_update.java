import java.sql.Connection;

public interface RentGiver_func_update {
    public void update_table_RentGiver(Connection con, String Item_table, String item, String new_description, float new_price);
}
