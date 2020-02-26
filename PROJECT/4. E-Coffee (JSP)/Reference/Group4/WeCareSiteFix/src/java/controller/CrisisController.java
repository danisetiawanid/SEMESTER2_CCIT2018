/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CrisisModel;

/**
 *
 * @author Martin Noverardi
 */
@WebServlet(name = "CrisisController", urlPatterns = {"/CrisisController"})
public class CrisisController extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-crisis")){
            response.sendRedirect("tambah_crisis.jsp");
            return;
        }else if(proses.equals("edit-crisis")){
            response.sendRedirect("edit_crisis.jsp?id_crisis="+request.getParameter("id_crisis"));
            return;
        }else if(proses.equals("hapus-crisis")){
            CrisisModel hm=new CrisisModel();
            hm.setId_crisis(request.getParameter("id_crisis"));
            hm.hapus();
            response.sendRedirect("crisis.jsp");
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("crisis")){
                CrisisModel um=new CrisisModel();
                um.setId_crisis(request.getParameter("id_crisis"));
                um.setJudul(request.getParameter("judul"));
                um.setDeskripsi(request.getParameter("deskripsi"));
                um.setKategori(request.getParameter("kategori"));
                if (proses.equals("input-crisis")){
                    um.simpan();
                }else if (proses.equals("update-crisis")){
                    um.update();
                } else if(proses.equals("hapus-crisis")){
                    um.hapus();
                }
                response.sendRedirect("crisis.jsp");
            }
        }
    }

}
