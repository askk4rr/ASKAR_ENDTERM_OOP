import java.sql.Connection;

public interface RentGiver_func_delete {
    public void delete_row_by_Item(Connection con, String item_table, String id);
}
