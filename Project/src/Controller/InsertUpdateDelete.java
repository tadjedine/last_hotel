/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class InsertUpdateDelete {
    
    public static void setData(String Query,String msg){
      Connection con =null;
      Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeLargeUpdate(Query);
            if(!msg.equalsIgnoreCase("")) JOptionPane.showMessageDialog(null, msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
           } 
            finally 
            {
                try {
                
                } catch (Exception e) {
                    }
            }
      
    } 
}
