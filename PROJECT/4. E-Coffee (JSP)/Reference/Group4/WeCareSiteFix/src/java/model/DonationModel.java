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
public class DonationModel {
String id_donasi,judul,nama_donatur,phone,jumlah,metode,pesan;
   Koneksi db = null;
       
    public DonationModel() {
        db = new Koneksi();
    }
    public String getId_donasi() {
        return id_donasi;
    }

    public void setId_donasi(String id_donasi) {
        this.id_donasi = id_donasi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNama_donatur() {
        return nama_donatur;
    }

    public void setNama_donatur(String nama_donatur) {
        this.nama_donatur = nama_donatur;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }


 public void simpan(){
        String sql="INSERT INTO tbl_donate values('"+judul+"','"+nama_donatur+"','"+phone+"','"+jumlah+"','"+metode+"','"+pesan+"')";
        String sql1 ="INSERT INTO tbl_donatur values('"+nama_donatur+"','"+phone+"')";
        db.simpanData(sql);
        db.simpanData(sql1);
    }
    public void update(){
        String sql="UPDATE tbl_donate SET judul='"+judul+"',nama_donatur='"+nama_donatur+"',phone='"+phone+"',jumlah='"+jumlah+"',metode='"+metode+"',pesan='"+pesan+"' WHERE id_donasi='"+id_donasi+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM tbl_donate WHERE ID_DONASI='"+id_donasi+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<DonationModel> data = new ArrayList<DonationModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_donate order by id_donasi desc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                DonationModel um = new DonationModel();
                um.setId_donasi(rs.getString("id_donasi"));
                um.setJudul(rs.getString("judul"));
                um.setNama_donatur(rs.getString("nama_donatur"));
                um.setPhone(rs.getString("phone"));
                um.setJumlah(rs.getString("jumlah"));
                um.setMetode(rs.getString("metode"));
                um.setPesan(rs.getString("pesan"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Donasi" + ex);
        }
        return data;
    }
        public List cariID() {
        List<DonationModel> data = new ArrayList<DonationModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM tbl_donate WHERE ID_DONASI='"+id_donasi+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                DonationModel m = new DonationModel();
                m.setId_donasi(rs.getString("id_donasi"));
                m.setJudul(rs.getString("judul"));
                m.setNama_donatur(rs.getString("nama_donatur"));
                m.setPhone(rs.getString("phone"));
                m.setJumlah(rs.getString("jumlah"));
                m.setMetode(rs.getString("metode"));
                m.setPesan(rs.getString("pesan"));
                
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID_DONASI" + ex);
        }
        return data;

    }
}

