
package com.urmi.connection;

import java.sql.Connection;


public class TestOracleConnection {
    public static void main(String[] args) {
        Connection conn = DbConnection.getConnection("xe", "hr", "hr");
    }
}
