package com.krld.jdbchw;

import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by Andrey on 8/22/2014.
 */
public class Driver implements java.sql.Driver {

    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static final String URL_START = "jdbc:hw:";

    @Override
    public java.sql.Connection connect(String url, Properties info) throws SQLException {
        Connection conn = new Connection(url, info);
        return conn;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return url.indexOf(URL_START) != -1;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    public static void log(String s) {
        System.out.println("+Driver: " + s);
    }
}
