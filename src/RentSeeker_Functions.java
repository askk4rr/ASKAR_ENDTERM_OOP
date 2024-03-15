import java.sql.Connection;

public class RentSeeker_Functions{
    DBFunctions db = new DBFunctions();
    DBFunctions_RentSeeker dbrs = new DBFunctions_RentSeeker();
    Connection con = db.connect_to_db("MadiDake", "postgres", "w6Yh7OHK2lxxA");
    public void rents(String id){
        dbrs.rent_item(con, "Items", id);
    }
}
