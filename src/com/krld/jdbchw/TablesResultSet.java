package com.krld.jdbchw;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Andrey on 8/23/2014.
 */
public class TablesResultSet extends AbstractResultSet {
    public static final int TABLE_NAME = 0;
    private final ArrayList<String[]> resultList;

    private int currentIndex = -1;

    @Override
    public boolean next() throws SQLException {
        currentIndex++;
        if (currentIndex > resultList.size() - 1) {
            return false;
        } else {
            return true;
        }
    }

    public String getString(int columnIndex) throws SQLException {
        if (currentIndex > resultList.size() - 1 || currentIndex < 0) {
            return null;
        } else {
            if (columnIndex >= 0 && columnIndex < 2) {
                return resultList.get(currentIndex)[columnIndex];
            }
            return null;
        }
    }

    public TablesResultSet() {
        resultList = new ArrayList<String[]>();
    }

    public void addRow(String tableName, String tableType) {
        resultList.add(new String[]{tableName, tableType});
    }
}
