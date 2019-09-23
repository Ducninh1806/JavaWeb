import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    private static Connection mysqlConnection;

    public static void openConnection() throws SQLException{
        try {
            mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","123456");

        }catch (SQLException ex){
            System.out.println("Có lỗi khi kết nối cơ sở dữ liệu");
            System.out.println(ex.getMessage());
        }


    }




}
