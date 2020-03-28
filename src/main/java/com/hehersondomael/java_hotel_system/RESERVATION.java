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
public class RESERVATION {
    // in the reservation table we need to add two foreign keys:
    // 1 for the client
    // -> ALTER TABLE reservations ADD CONSTRAINT fk_client_id FOREIGN KEY (client_id) REFERENCES clients(id) on DELETE CASCADE
    // 2 for the room
    // -> ALTER TABLE reservations ADD CONSTRAINT fk_room_number FOREIGN KEY (room_number) REFERENCES rooms(r_number) on DELETE CASCADE;
    // and add another foreign key between table types
    // -> ALTER TABLE rooms ADD CONSTRAINT fk_type_id FOREIGN KEY (type) REFERENCES type(id) on DELETE CASCADE
    
    
    // some fixes we need to do
    // 1 - when new reservation to a room added, set reservation status to yes
    // if deleted, set status to no
    // 2 - when new reservation added, check if room is already reserved
    // 3 - check if date in > current date
    // check if date out > date in
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
    ROOMS  room = new ROOMS();
    // create a function to add a new reservation
        public boolean addReservation(int client_id, int room_number, String dateIn, String dateOut)
        {
        PreparedStatement st;
        String addQuery = "INSERT INTO `reservations`(`client_id`, `room_number`, `date_in`, `date_out`) VALUES (?,?,?,?)";
        try {
           st = my_connection.createConnection().prepareStatement(addQuery);

           st.setInt(1, client_id);
           st.setInt(2, room_number);
           st.setString(3, dateIn);
           st.setString(4, dateOut);
           
           if (st.executeUpdate() > 0)
           {
               
               return st.executeUpdate() > 0;
           }
           else
           {
               // bookmark: 5:32:19
               return false;
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            }
        }    

    public boolean editReservation(int reservation_id, int client_id, int room_number, String dateIn, String dateOut)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `reservations` SET `client_id`=?, `room_number`=?, `date_in`=?, `date_out`=? WHERE `id`=?";
        
        try {
           st = my_connection.createConnection().prepareStatement(editQuery);

           st.setInt(1, client_id);
           st.setInt(2, room_number);
           st.setString(3, dateIn);
           st.setString(4, dateOut);
           st.setInt(5, reservation_id);
           
           return (st.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }        

    // create a function to remove the selected reservation
    public boolean removeReservation(int reservation_id)
    {
                PreparedStatement st;
        String deleteQuery = "DELETE FROM `reservation` WHERE `r_number`=?";
        
        try {
           st = my_connection.createConnection().prepareStatement(deleteQuery);
           
           st.setInt(1, reservation_id);
           
           return (st.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

        public void fillReservationsJTable(JTable table)
        { 
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `reservations`";
        
        try {
            ps = my_connection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();

            Object[] row;
            
            while(rs.next())
            {
                row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);

                tableModel.addRow(row);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}