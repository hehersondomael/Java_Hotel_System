/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_hotel_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heherson Domael
 */
public class CLIENT { // the client class
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    // create a function to add a client
    public boolean addClient(String fname, String lname, String phone, String email) throws SQLException
    {
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "INSERT INTO `clients`(`first_name`, `last_name`, `phone`, `email`) VALUES (?, ?, ?, ?)";
        
        try {
           st = my_connection.createConnection().prepareStatement(addQuery);
           
           st.setString(1, fname);
           st.setString(2, lname);
           st.setString(3, phone);
           st.setString(4, email);
           
           if(st.executeUpdate() > 0)
               return true;
           else
               return false;
           
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    // create a function to edit the selected client
    
    
    // create a function to remove the selected client
    
    // create a function to populate the jTable with all the clients in the database
    
    public void fillClientTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM clients";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}