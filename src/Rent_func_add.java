import java.sql.Connection;

public interface Rent_func_add {
    public void add_table_Rent(Connection con, String Item_table, String item, String description, float price);
}
