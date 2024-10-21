import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OpenGaussJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://192.168.26.146:5432/school";
        String user = "cas";
        String password = "1qaz2wsx3EDC";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT version()")) {

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}