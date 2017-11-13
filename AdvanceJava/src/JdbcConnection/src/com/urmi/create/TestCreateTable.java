package com.urmi.create;

import com.urmi.connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCreateTable {

    //static Connection conn = MySqlDbConnection.getConnection();
    static Connection conn = DbConnection.getConnection("xe", "hr", "hr");

    public static void main(String[] args) {
        String sql = "Create Table studentbd"
                + "(id Integer not NULL, "
                + " student_name VARCHAR (255), "
                + "Primary Key (id)) ";
        
    try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            int i = pstm.executeUpdate();
            System.out.println(i+"table has been created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(TestCreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
    }
}

        
           
        
