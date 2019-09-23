import java.sql.*;

public class JDBCconnected {

    private static Connection mysqlConnection;

    public static void openConnection() throws SQLException {
        try {
            mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "123456");

        }catch (SQLException e){
            System.out.println("Có lỗi khi kết nối cơ sở dữ liệu");
            System.out.println(e.getMessage());
        }
    }

    public static void CloseConnection() throws SQLException{
        if (mysqlConnection != null && !mysqlConnection.isClosed()){
            mysqlConnection.close();
        }

    }

    public static Statement creatStatement() throws SQLException{
        if (mysqlConnection == null){
            openConnection();
        }
        Statement statement = mysqlConnection.createStatement();
        return statement;
    }

    public static PreparedStatement createPreparedStatement(String sql) throws SQLException{
        if (mysqlConnection ==null){
            openConnection();
        }

        PreparedStatement statement = mysqlConnection.prepareStatement(sql);
        return statement;

    }

    public static void main(String[] args) {
        try{
            openConnection();
            Statement statement =  creatStatement();
            ResultSet result= statement.executeQuery("SELECT * From Customers");


            close

        }catch (SQLException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
