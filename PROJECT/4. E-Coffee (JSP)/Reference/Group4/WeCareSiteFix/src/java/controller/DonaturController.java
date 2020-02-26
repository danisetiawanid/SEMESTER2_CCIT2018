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
import model.DonaturModel;

/**
 *
 * @author Martin Noverardi
 */
@WebServlet(name = "DonaturController", urlPatterns = {"/DonaturController"})
public class DonaturController extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-donatur")){
            response.sendRedirect("tambah_donatur.jsp");
            return;
        }else if(proses.equals("edit-donatur")){
            response.sendRedirect("edit_donatur.jsp?id_donatur="+request.getParameter("id_donatur"));
            return;
        }else if(proses.equals("hapus-donatur")){
            DonaturModel hm=new DonaturModel();
            hm.setId_donatur(request.getParameter("id_donatur"));
            hm.hapus();
            response.sendRedirect("donatur.jsp");
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("donatur")){
                DonaturModel um=new DonaturModel();
                um.setId_donatur(request.getParameter("id_donatur"));
                um.setPhone(request.getParameter("phone"));
                um.setNama_donatur(request.getParameter("nama_donatur"));
                if (proses.equals("input-donatur")){
                    um.simpan();
                }else if (proses.equals("update-donatur")){
                    um.update();
                } else if(proses.equals("hapus-donatur")){
                    um.hapus();
                }
                response.sendRedirect("donatur.jsp");
            }
        }
    }

}