import java.sql.*;

public class Main {
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "mypassword";
    private static final String CONNECT_STRING = "jdbc:mysql://localhost/mytra";

//    public static void main(String[] args) {
//        try (
//                Connection conn = DriverManager.getConnection(CONNECT_STRING, USERNAME, PASSWORD);
//                Statement statement = conn.createStatement(
//                        ResultSet.TYPE_SCROLL_INSENSITIVE,
//                        ResultSet.CONCUR_READ_ONLY);
//                ResultSet  rs = statement.executeQuery("SELECT * FROM cloths");
//                ) {
//            System.out.println("DB Connected!");
//            rs.last();
//            System.out.println("number of records:" + rs.getRow());
//            System.out.println(rs.getInt("quantity"));
//            System.out.println(rs.getString("type"));
//            System.out.println(rs.getString("size"));
//            System.out.println(rs.getDouble("price"));
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
}

// localhost:3000
