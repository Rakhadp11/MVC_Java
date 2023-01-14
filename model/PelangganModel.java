/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.mvc.model;

import pbo.mvc.event.PelangganListener;

/**
 *
 * @author rakha
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    
    private PelangganListener pelangganLisetener;
    
    public PelangganListener getPelangganListener(){
        return pelangganLisetener;
    }
    
    public void setPelangganListener(PelangganListener.pelangganLisetener){
        this.pelangganLisetener = pelangganLisetener;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoTelp() {
        return noTelp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }

   protected void fireOnChange(){
       if (pelangganLisetener !=null){
           pelangganLisetener.OnChange(this);
       }
    }
   
   
    
}
