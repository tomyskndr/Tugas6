/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.skndr.latihanmvc.event;

import edu.skndr.latihanmvc.entity.Pelanggan;
import edu.skndr.latihanmvc.model.PelangganModel;

/**
 *
 * @author user
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);

    
    
}
