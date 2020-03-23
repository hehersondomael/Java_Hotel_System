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
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heherson Domael
 */
public class ROOMS {
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    // create a function to display all rooms type in jTable
        public void fillRooms_TYPE_Table(JTable table)
    { 
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();

            Object[] row;
            
            while(rs.next())
            {
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                
                tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // create a function to fill a combobox with the rooms-type id
    public void fillRooms_TYPE_JCombobox(JComboBox comboBox)
    { 
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();

            while(rs.next())
            {
                comboBox.addItem(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}