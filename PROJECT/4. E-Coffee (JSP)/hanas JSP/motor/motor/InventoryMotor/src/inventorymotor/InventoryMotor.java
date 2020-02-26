/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymotor;

import inventorymotor.Connection.Koneksi;
import inventorymotor.Frame.Login.Login;


/**
 *
 * @author ASUS
 */
public class InventoryMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi koneksi = new Koneksi();
        koneksi.open();
        
        Login frame = new Login();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
