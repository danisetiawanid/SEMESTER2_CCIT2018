/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DonationModel;

/**
 *
 * @author Martin Noverardi
 */
@WebServlet(name = "DonationController", urlPatterns = {"/DonationController"})
public class DonationController extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-donation")){
            response.sendRedirect("tambah_donation.jsp");
            return;
        }else if(proses.equals("edit-donation")){
            response.sendRedirect("edit_donation.jsp?id_donasi="+request.getParameter("id_donasi"));
            return;
        }else if(proses.equals("hapus-donasi")){
            DonationModel hm=new DonationModel();
            hm.setId_donasi(request.getParameter("id_donasi"));
            hm.hapus();
            response.sendRedirect("donate1.jsp");
        }
    }
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("donation")){
                DonationModel um=new DonationModel();
                um.setId_donasi(request.getParameter("id_donasi"));
                um.setJudul(request.getParameter("judul"));
                um.setNama_donatur(request.getParameter("nama_donatur"));
                um.setPhone(request.getParameter("phone"));
                um.setJumlah(request.getParameter("jumlah"));
                um.setMetode(request.getParameter("metode"));
                um.setPesan(request.getParameter("pesan"));
                
                if (proses.equals("input-donation")){
                    um.simpan();
                }else if (proses.equals("update-donation")){
                    um.update();
                } else if(proses.equals("hapus-donation")){
                    um.hapus();
                }
                response.sendRedirect("donate1.jsp");
            }
        }
    }

}
