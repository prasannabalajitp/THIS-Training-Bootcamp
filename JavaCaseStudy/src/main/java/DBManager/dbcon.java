package DBManager;

import bpack.Train;

import java.sql.*;
import java.util.ArrayList;

public class dbcon {
    public ArrayList<Train> tr=new ArrayList<>();

    public void dataCon() throws ClassNotFoundException, SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/trainsdb", "root",
                "Serengeti2948$$");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from trains");
        System.out.println("Train_No | Train_Name | Boarding | Destination | Ticket_Price");
        while (rs.next()) {
            tr.add(new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getInt(5));
            System.out.println("---------------------------------------------------------------------------");
        }
    }
}
