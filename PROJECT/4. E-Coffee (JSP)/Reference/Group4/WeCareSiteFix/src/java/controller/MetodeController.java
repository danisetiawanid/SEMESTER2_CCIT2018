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
import model.MetodeModel;

@WebServlet(urlPatterns = {"/MetodeController"})

public class MetodeController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-metode")){
            response.sendRedirect("tambah_metode.jsp");
            return;
        }else if(proses.equals("edit-metode")){
            response.sendRedirect("edit_metode.jsp?id_pembayaran="+request.getParameter("id_pembayaran"));
            return;
        }else if(proses.equals("hapus-metode")){
            MetodeModel hm=new MetodeModel();
            hm.setId_pembayaran(request.getParameter("id_pembayaran"));
            hm.hapus();
            response.sendRedirect("metode.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("metode")){
                MetodeModel um=new MetodeModel();
                um.setId_pembayaran(request.getParameter("id_pembayaran"));
                um.setMetode(request.getParameter("metode"));
                if (proses.equals("input-metode")){
                    um.simpan();
                }else if (proses.equals("update-metode")){
                    um.update();
                } else if(proses.equals("hapus-metode")){
                    um.hapus();
                }
                response.sendRedirect("metode.jsp");
            }
        }
    }

}
 
