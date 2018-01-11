/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.skndr.latihanmvc.main;


import edu.skndr.latihanmvc.database.KingBarbershopDatabase;
import edu.skndr.latihanmvc.entity.Pelanggan;
import edu.skndr.latihanmvc.error.PelangganException;
import edu.skndr.latihanmvc.service.PelangganDao;
import edu.skndr.latihanmvc.view.MainViewPelanggan;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
        
        
    }
    
}
