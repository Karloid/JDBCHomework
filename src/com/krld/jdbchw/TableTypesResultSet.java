package com.krld.jdbchw;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

/**
 * Created by Andrey on 8/23/2014.
 */
public class TableTypesResultSet extends AbstractResultSet {
    private int currentIndex = -1;

    @Override
    public boolean next() throws SQLException {
        currentIndex++;
        if (currentIndex > TableTypes.values().length - 1) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public String getString(int columnIndex) throws SQLException {
        if (currentIndex > TableTypes.values().length - 1 || currentIndex < 0) {
            return null;
        } else {
            return TableTypes.values()[currentIndex].toString();
        }
    }
}
