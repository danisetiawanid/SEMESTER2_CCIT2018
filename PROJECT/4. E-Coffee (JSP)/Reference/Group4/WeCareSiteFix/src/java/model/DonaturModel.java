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
 * @author Martin Noverardi
 */
public class DonaturModel {
String id_donatur,phone,nama_donatur;
 Koneksi db = null;
  public DonaturModel() {
        db = new Koneksi();
    }
    public String getId_donatur() {
        return id_donatur;
    }

    public void setId_donatur(String id_donatur) {
        this.id_donatur = id_donatur;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNama_donatur() {
        return nama_donatur;
    }

    public void setNama_donatur(String nama_donatur) {
        this.nama_donatur = nama_donatur;
    }
    
 public void simpan(){
        String sql="INSERT INTO tbl_donatur values('"+phone+"','"+nama_donatur+"')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE tbl_donatur SET phone='"+phone+"',nama_donatur='"+nama_donatur+"' WHERE id_donatur='"+id_donatur+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM tbl_donatur WHERE ID_DONATUR='"+id_donatur+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<DonaturModel> data = new ArrayList<DonaturModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_donatur order by nama_donatur asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                DonaturModel um = new DonaturModel();
                um.setId_donatur(rs.getString("id_donatur"));
                um.setPhone(rs.getString("Phone"));
                um.setNama_donatur(rs.getString("nama_donatur"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Donatur" + ex);
        }
        return data;
    }
        public List cariID_DONATUR() {
        List<DonaturModel> data = new ArrayList<DonaturModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM tbl_donatur WHERE ID_DONATUR='"+id_donatur+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                DonaturModel m = new DonaturModel();
                m.setId_donatur(rs.getString("id_donatur"));
                m.setPhone(rs.getString("phone"));
                m.setNama_donatur(rs.getString("nama_donatur"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
}

