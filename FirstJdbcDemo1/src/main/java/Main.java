import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bookdb","root",
                "Serengeti2948$$");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from book");
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+
                    " "+rs.getInt(3));
        }
        con.close();
    }
}
