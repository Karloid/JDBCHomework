import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 8/22/2014.
 */
public class TestDrive {
    public static void main(String[] args) throws Exception {
        testJDBC();
    }

    private static void testJDBC() throws Exception {
        String url = "jdbc:hw:test";
        log("Start with url: " + url);
        String driverClassName = "com.krld.jdbchw.Driver";
        log("Load driver: " + "com.krld.jdbchw.Driver");
        Class.forName(driverClassName);

        Connection conn = DriverManager.getConnection(url);
        printTables(conn);
        printTablesContent(conn);
        conn.close();
    }

    private static void printTablesContent(Connection conn) throws SQLException {
        Statement stat = conn.createStatement();
        String query = "select * from soldiers  ";
        log("Execute query: " + query);
        ResultSet rs = stat.executeQuery(query);
        log("Result set values... ");
        log("..|    COL    |");
        while (rs.next()) {
            log(".." + rs.getString("COL"));
        }
        rs.close();
    }

    private static void printTables(Connection conn) throws SQLException {
        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet tableTypes = metaData.getTableTypes();
        List<String> tableTypesStr = new ArrayList<String>();
        log("Get table types...");
        while (tableTypes.next()) {
            log("..table type: " + tableTypes.getString(0));
            tableTypesStr.add(tableTypes.getString(0));
        }
        ResultSet tables = metaData.getTables("", "", "", tableTypesStr.toArray(new String[]{}));
        log("Get table names...");
        while (tables.next()) {
            log("..table name: " + tables.getString(0) + ", table type: " + tables.getString(1));
        }
    }

    private static void log(String s) {
        System.out.println(">TestDrive: " + s);
    }


}
