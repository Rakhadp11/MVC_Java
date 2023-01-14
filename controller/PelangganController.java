/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.mvc.controller;
import javax.swing.JOptionPane;
import pbo.mvc.model.PelangganModel;
import pbo.mvc.view.PelangganView;
/**
 *
 * @author rakha
 */
public class PelangganController {
    private PelangganModel model;
    
    public void setModel(PelangganModel model){
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        }
    }
    
    
}
