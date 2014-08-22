package com.krld.jdbchw;

/**
 * Created by Andrey on 8/23/2014.
 */
public enum TableTypes {
    TABLE, VIEW;
    String fileExtension;
    static {
        TABLE.fileExtension = "CSV";
        VIEW.fileExtension = "TXT";

    }
}
