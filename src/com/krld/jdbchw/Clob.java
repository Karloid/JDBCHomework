package com.krld.jdbchw;

import java.io.*;
import java.sql.SQLException;

/**
 * Created by Andrey on 8/26/2014.
 */
public class Clob implements java.sql.Clob {   // TODO IMPL
    private final File file;

    public Clob(File file) {
        this.file = file;
    }

    @Override
    public long length() throws SQLException {
        return 0;
    }

    @Override
    public String getSubString(long pos, int length) throws SQLException {
        return null;
    }

    @Override
    public Reader getCharacterStream() throws SQLException {
        return null;
    }

    @Override
    public InputStream getAsciiStream() throws SQLException {
        return null;
    }

    @Override
    public long position(String searchstr, long start) throws SQLException {
        return 0;
    }

    @Override
    public long position(java.sql.Clob searchstr, long start) throws SQLException {
        return 0;
    }

    @Override
    public int setString(long pos, String str) throws SQLException {
        return 0;
    }

    @Override
    public int setString(long pos, String str, int offset, int len) throws SQLException {
        return 0;
    }

    @Override
    public OutputStream setAsciiStream(long pos) throws SQLException {
        return null;
    }

    @Override
    public Writer setCharacterStream(long pos) throws SQLException {
        return null;
    }

    @Override
    public void truncate(long len) throws SQLException {

    }

    @Override
    public void free() throws SQLException {

    }

    @Override
    public Reader getCharacterStream(long pos, long length) throws SQLException {
        return null;
    }
}
