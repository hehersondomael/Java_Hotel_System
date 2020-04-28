/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_hotel_system;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Heherson Domael
 */
public class ManageReservationsForm extends javax.swing.JFrame {

    RESERVATION reservation = new RESERVATION();
    /**
     * Creates new form ManageReservationsForm
     */
    public ManageReservationsForm() {
        initComponents();

        reservation.fillReservationsJTable(jTable1);
        jTable1.setRowHeight(25);

        jButtonEditReservation.setEnabled(false);
        jButtonRemoveReservation.setEnabled(false);
        jButtonClearFields.setEnabled(false);

       this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Exit?", "Close", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                {
                    e.getWindow().dispose();
                    MainForm mainForm = new MainForm();
                    mainForm.setVisible(true);
                    mainForm.pack();
                    mainForm.setLocationRelativeTo(null);
                    mainForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
                else
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        }
        );        

        setJTableColumnsWidth(jTable1,180,20,20,20,50,50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldReservationID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldClientID = new javax.swing.JTextField();
        jTextFieldRoomNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAddReservation = new javax.swing.JButton();
        jButtonEditReservation = new javax.swing.JButton();
        jButtonRemoveReservation = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButton_Refresh_JTable_Data = new javax.swing.JButton();
        jDateChooserDateIn = new com.toedter.calendar.JDateChooser();
        jDateChooserDateOut = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jPanel2.setBackground(new java.awt.Color(7, 76, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Reservations");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        jTextFieldReservationID.setEditable(false);
        jTextFieldReservationID.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldReservationID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client ID:");

        jTextFieldClientID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClientIDActionPerformed(evt);
            }
        });
        jTextFieldClientID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClientIDKeyTyped(evt);
            }
        });

        jTextFieldRoomNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextFieldRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRoomNoActionPerformed(evt);
            }
        });
        jTextFieldRoomNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRoomNoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room No.:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date In:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Out:");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Client ID", "Room No.", "Date In", "Date Out"
            }
        )
        {
            Class[] types = { Integer.class, Integer.class, Integer.class, String.class, String.class};
            boolean[] canEdit = { true, true, true, true, true};

            @Override
            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }

            public boolean isCellEditable(int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonAddReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonAddReservation.setText("Add New Reservation");
        jButtonAddReservation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonAddReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddReservationActionPerformed(evt);
            }
        });

        jButtonEditReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonEditReservation.setText("Edit");
        jButtonEditReservation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonEditReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditReservationActionPerformed(evt);
            }
        });

        jButtonRemoveReservation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonRemoveReservation.setText("Remove");
        jButtonRemoveReservation.setActionCommand("Delete");
        jButtonRemoveReservation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonRemoveReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoveReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveReservationActionPerformed(evt);
            }
        });

        jButtonClearFields.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonClearFields.setText("Clear Fields");
        jButtonClearFields.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldsActionPerformed(evt);
            }
        });

        jButton_Refresh_JTable_Data.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Refresh_JTable_Data.setText("Refresh Data");
        jButton_Refresh_JTable_Data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh_JTable_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_JTable_DataActionPerformed(evt);
            }
        });

        jDateChooserDateIn.setDateFormatString("MMM dd yyyy");
        jDateChooserDateIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDateChooserDateInKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooserDateInKeyTyped(evt);
            }
        });

        jDateChooserDateOut.setDateFormatString("MMM dd yyyy");
        jDateChooserDateOut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooserDateOutKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldReservationID, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jTextFieldClientID)
                            .addComponent(jTextFieldRoomNo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAddReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButtonEditReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemoveReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonClearFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserDateIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserDateOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Refresh_JTable_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldReservationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jDateChooserDateIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDateOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRemoveReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientIDActionPerformed

    private void jTextFieldRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRoomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRoomNoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jButtonAddReservation.setEnabled(false);
        jButtonEditReservation.setEnabled(true);
        jButtonRemoveReservation.setEnabled(true);
        jButtonClearFields.setEnabled(true);

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rIndex = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());

        jTextFieldReservationID.setText(model.getValueAt(rIndex,0).toString());
        jTextFieldClientID.setText(model.getValueAt(rIndex,1).toString());
        jTextFieldRoomNo.setText(model.getValueAt(rIndex,2).toString());
        
        try {
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex,3).toString());
            jDateChooserDateIn.setDate(dateIn);
            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex,4).toString());
            jDateChooserDateOut.setDate(dateOut);
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddReservationActionPerformed
        try {
            int client_id = Integer.valueOf(jTextFieldClientID.getText());
            int room_number = Integer.valueOf(jTextFieldRoomNo.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = dateFormat.format(jDateChooserDateIn.getDate());
            String date_out = dateFormat.format(jDateChooserDateOut.getDate());
            String toDayDate = dateFormat.format(new Date());

            Date dIn = dateFormat.parse(date_in);
            Date dOut = dateFormat.parse(date_out);
            Date tDD = dateFormat.parse(toDayDate);

            if(!(dIn.after(tDD) || dIn.equals(tDD)))
                JOptionPane.showMessageDialog(rootPane, "The date in must be after or equal to today date", "Date In Error", JOptionPane.ERROR_MESSAGE);
            else if (!(dOut.after(dIn) || dOut.equals(dIn)))
                JOptionPane.showMessageDialog(rootPane, "The date Out must be after or equal to today date IN ", "Date Out Error", JOptionPane.ERROR_MESSAGE);
            else
                if (reservation.addReservation(client_id, room_number, date_in, date_out))
                {
                    JOptionPane.showMessageDialog(rootPane, "New Reservation Added Successfully", "Add Reservation", JOptionPane.INFORMATION_MESSAGE);
                    jTextFieldClientID.setText("");
                    jTextFieldReservationID.setText("");
                    jTextFieldRoomNo.setText("");
                    jDateChooserDateIn.setDate(null);
                    jDateChooserDateOut.setDate(null);
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Reservation NOT Added", "Add Reservation Error", JOptionPane.ERROR_MESSAGE);       
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " Enter the room number + Client ID", "Input Fields Error", JOptionPane.ERROR_MESSAGE);
          }
          catch (ParseException ex) {
              Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButtonAddReservationActionPerformed

    private void jButtonEditReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditReservationActionPerformed
        try {
            int reservationID = Integer.valueOf(jTextFieldReservationID.getText());
            int roomNumber = Integer.valueOf(jTextFieldRoomNo.getText());
            int clientID = Integer.valueOf(jTextFieldClientID.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date_in = dateFormat.format(jDateChooserDateIn.getDate());
            String date_out = dateFormat.format(jDateChooserDateOut.getDate());
            String toDayDate = dateFormat.format(new Date());

            Date dIn = dateFormat.parse(date_in);
            Date dOut = dateFormat.parse(date_out);
            Date tDD = dateFormat.parse(toDayDate);     

            if(!(dIn.after(tDD) || dIn.equals(tDD)))
                JOptionPane.showMessageDialog(rootPane, "The date in must be after or equal to today date", "Date In Error", JOptionPane.ERROR_MESSAGE);
            else if (!(dOut.after(dIn) || dOut.equals(dIn)))
                JOptionPane.showMessageDialog(rootPane, "The date Out must be after or equal to today date IN ", "Date Out Error", JOptionPane.ERROR_MESSAGE);
            else
                if (reservation.editReservation(reservationID, clientID, roomNumber, date_in, date_out))
                {
                    JOptionPane.showMessageDialog(rootPane, "Reservation Information Updated Successfully", "Edit Reservation", JOptionPane.INFORMATION_MESSAGE);
                    ClearFields();
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Reservation Information Not Updated", "Edit Reservation Error", JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " Enter the Room number + Client ID + Reservation ID", "Data Number Error", JOptionPane.ERROR_MESSAGE);
          }
          catch(NullPointerException ex) {
              JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " Selecte the Date In and Date Out", "Date Error", JOptionPane.ERROR_MESSAGE);
          }
          catch (ParseException ex) {
              Logger.getLogger(ManageReservationsForm.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButtonEditReservationActionPerformed

    private void jButtonRemoveReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveReservationActionPerformed
        try {
            int reservationID = Integer.valueOf(jTextFieldReservationID.getText());

            if (reservation.removeReservation(reservationID))
            {
                JOptionPane.showMessageDialog(rootPane, "Reservation Deleted Successfully", "Remove Reservation", JOptionPane.INFORMATION_MESSAGE);
                ClearFields();                        
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Reservation Not Deleted", "Remove Reservation Error", JOptionPane.ERROR_MESSAGE);
       } catch(NumberFormatException ex) {
           JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " Enter the Reservation ID", "Reservation ID Error", JOptionPane.ERROR_MESSAGE);
         }        
    }//GEN-LAST:event_jButtonRemoveReservationActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        ClearFields();
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButton_Refresh_JTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_JTable_DataActionPerformed
        ClearFields();

        jTable1.setModel(new DefaultTableModel(new Object [][] {},
                new String [] {"Reservation ID", "Client ID", "Room No.", "Date In", "Date Out" })
                {
                Class[] types = { Integer.class, Integer.class, Integer.class, String.class, String.class};
                boolean[] canEdit = { true, true, true, true, true};

                @Override
                public Class getColumnClass(int columnIndex) {
                    return this.types[columnIndex];
                }

                public boolean isCellEditable(int columnIndex) {
                    return this.canEdit[columnIndex];
                }
                }
        
        );

        reservation.fillReservationsJTable(jTable1);
        setJTableColumnsWidth(jTable1,180,20,20,20,50,50);
    }//GEN-LAST:event_jButton_Refresh_JTable_DataActionPerformed

    private void jTextFieldClientIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientIDKeyTyped
        if (jTextFieldReservationID.getText().trim().equals("") &&
            jTextFieldClientID.getText().trim().equals("") &&
            jTextFieldRoomNo.getText().trim().equals(""))
                jButtonClearFields.setEnabled(false);
        if (!(jTextFieldReservationID.getText().trim().equals("")) ||
            !(jTextFieldClientID.getText().trim().equals("")) ||
            !(jTextFieldRoomNo.getText().trim().equals("")))
                jButtonClearFields.setEnabled(true);
    }//GEN-LAST:event_jTextFieldClientIDKeyTyped

    private void jTextFieldRoomNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRoomNoKeyTyped
        if (jTextFieldReservationID.getText().trim().equals("") &&
            jTextFieldClientID.getText().trim().equals("") &&
            jTextFieldRoomNo.getText().trim().equals(""))
                jButtonClearFields.setEnabled(false);
        if (!(jTextFieldReservationID.getText().trim().equals("")) ||
            !(jTextFieldClientID.getText().trim().equals("")) ||
            !(jTextFieldRoomNo.getText().trim().equals("")))
                jButtonClearFields.setEnabled(true);
    }//GEN-LAST:event_jTextFieldRoomNoKeyTyped

    private void jDateChooserDateInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserDateInKeyTyped
        if (jTextFieldReservationID.getText().trim().equals("") &&
            jTextFieldClientID.getText().trim().equals("") &&
            jTextFieldRoomNo.getText().trim().equals(""))
                jButtonClearFields.setEnabled(false);
        if (!(jTextFieldReservationID.getText().trim().equals("")) ||
            !(jTextFieldClientID.getText().trim().equals("")) ||
            !(jTextFieldRoomNo.getText().trim().equals("")))
                jButtonClearFields.setEnabled(true);
    }//GEN-LAST:event_jDateChooserDateInKeyTyped

    private void jDateChooserDateOutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserDateOutKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDateOutKeyTyped

    private void jDateChooserDateInKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserDateInKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserDateInKeyReleased

    public void ClearFields()
    {
        jTextFieldReservationID.setText("");
        jTextFieldClientID.setText("");
        jTextFieldRoomNo.setText("");
        jDateChooserDateIn.setDate(null);
        jDateChooserDateOut.setDate(null);
        jButtonAddReservation.setEnabled(true);
        jButtonEditReservation.setEnabled(false);
        jButtonRemoveReservation.setEnabled(false);
        jButtonClearFields.setEnabled(false);
    }

    public static void setJTableColumnsWidth(JTable table, int tablePreferredWidth, double... percentages)
    {
        double total = 0;
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            total += percentages[i];
        }

        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth((int)
                    (tablePreferredWidth * (percentages[i] / total)));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReservationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReservationsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddReservation;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditReservation;
    private javax.swing.JButton jButtonRemoveReservation;
    private javax.swing.JButton jButton_Refresh_JTable_Data;
    private com.toedter.calendar.JDateChooser jDateChooserDateIn;
    private com.toedter.calendar.JDateChooser jDateChooserDateOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldClientID;
    private javax.swing.JTextField jTextFieldReservationID;
    private javax.swing.JTextField jTextFieldRoomNo;
    // End of variables declaration//GEN-END:variables
}