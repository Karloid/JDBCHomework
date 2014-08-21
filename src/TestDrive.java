import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Andrey on 8/22/2014.
 */
public class TestDrive {
    public static void main(String[] args) throws Exception {
        testJDBC();
    }

    private static void testJDBC() throws Exception {
        System.out.println("TODO test JDBC...");
        Class.forName("com.krld.jdbchw.DriverImp");
        Connection conn = DriverManager.getConnection("jdbc:hw:test");
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from soldiers");
        while (rs.next()) {
            System.out.println("name = "  + rs.getString("name"));
        }
        rs.close();
        conn.close();
    }
}
