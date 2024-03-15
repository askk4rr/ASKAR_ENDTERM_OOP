import java.sql.Connection;

public class Rent {
    DBFunctions db = new DBFunctions();
    DBFunctions_Rent rent = new DBFunctions_Rent();
    Connection con = db.connect_to_db("MadiDake", "postgres", "w6Yh7OHK2lxxA");

    public void rents() {
        rent.create_table_Rent(con, "Rents");
    }
    public void view_rent(){
        rent.read_data_rents(con, "Rents");
    }
    public void delete_rent(String id){
        rent.delete_row_by_Rent(con, "Rents", id);
    }

}
