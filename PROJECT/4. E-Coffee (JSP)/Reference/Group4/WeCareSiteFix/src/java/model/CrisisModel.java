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
public class CrisisModel {
     String id_crisis,judul,deskripsi,kategori;
     Koneksi db = null;
 public CrisisModel() {
        db = new Koneksi();
 }
    public String getId_crisis() {
        return id_crisis;
    }

    public void setId_crisis(String id_crisis) {
        this.id_crisis = id_crisis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
   
    public void simpan(){
        String sql="INSERT INTO tbl_crisis values('"+judul+"','"+deskripsi+"','"+kategori+"')";
        db.simpanData(sql);
    }
    public void update(){
        String sql="UPDATE tbl_crisis SET judul='"+judul+"',deskripsi='"+deskripsi+"',kategori='"+kategori+"' WHERE id_crisis='"+id_crisis+"'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    public void hapus(){
        String sql="DELETE FROM tbl_crisis WHERE ID_CRISIS='"+id_crisis+"'";
        db.simpanData(sql);
        System.out.println("");
    }
    public List tampil() {
        List<CrisisModel> data = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis order by id_crisis asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data;
    }
public List tampil1() {
        List<CrisisModel> data1 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2004'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data1.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data1;
    }
public List tampil2() {
        List<CrisisModel> data2 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2005'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data2.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data2;
    }
public List tampil3() {
        List<CrisisModel> data3 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2006'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data3.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data3;
    }
public List tampil4() {
        List<CrisisModel> data4 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2007'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data4.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data4;
    }
public List tampil5() {
        List<CrisisModel> data5 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2008'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data5.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data5;
    }
public List tampil6() {
        List<CrisisModel> data6 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2009'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data6.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data6;
    }
public List tampil7() {
        List<CrisisModel> data7 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2010'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data7.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data7;
    }
public List tampil8() {
        List<CrisisModel> data8 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2011'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data8.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data8;
    }
public List tampil9() {
        List<CrisisModel> data9 = new ArrayList<CrisisModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from tbl_crisis where id_crisis='2012'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel um = new CrisisModel();
                um.setId_crisis(rs.getString("id_crisis"));
                um.setJudul(rs.getString("judul"));
                um.setDeskripsi(rs.getString("deskripsi"));
                um.setKategori(rs.getString("kategori"));
                data9.add(um);
                
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data Crisis" + ex);
        }
        return data9;
    }

    public List cariID_CRISIS() {
        List<CrisisModel> data = new ArrayList<CrisisModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM tbl_crisis WHERE ID_CRISIS='"+id_crisis+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                CrisisModel m = new CrisisModel();
                m.setId_crisis(rs.getString("id_crisis"));
                m.setJudul(rs.getString("judul"));
                m.setDeskripsi(rs.getString("deskripsi"));
                m.setKategori(rs.getString("kategori"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID_CRISIS" + ex);
        }
        return data;

    }

}
