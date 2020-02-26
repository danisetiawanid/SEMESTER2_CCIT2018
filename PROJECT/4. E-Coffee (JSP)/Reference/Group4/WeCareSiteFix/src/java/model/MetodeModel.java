/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TutorialPedia
 */
public class MetodeModel {
   String id_pembayaran,metode;
   Koneksi db = null;
       
    public MetodeModel() {
        db = new Koneksi();
    }

    public String getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

   
    public void simpan(){
        String sql="INSERT INTO tbl_pembayaran values('"+metode+"')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE tbl_pembayaran SET metode='"+metode+"' WHERE id_pembayaran='"+id_pembayaran+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM tbl_pembayaran WHERE ID_PEMBAYARAN='"+id_pembayaran+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<MetodeModel> data = new ArrayList<MetodeModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_pembayaran order by metode asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                MetodeModel um = new MetodeModel();
                um.setId_pembayaran(rs.getString("id_pembayaran"));
                um.setMetode(rs.getString("metode"));
                
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
        public List cariID_PEMBAYARAN() {
        List<MetodeModel> data = new ArrayList<MetodeModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM tbl_pembayaran WHERE ID_PEMBAYARAN='"+id_pembayaran+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                MetodeModel m = new MetodeModel();
                m.setId_pembayaran(rs.getString("id_pembayaran"));
                m.setMetode(rs.getString("metode"));
                
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID_PEMBAYARAN" + ex);
        }
        return data;

    }
}
