/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.elementos.controller;
import com.jc.elementos.model.Trabajador;
import com.jc.elementos.model.Utilidadeshibernate;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author Ricardo.huarte
 */
public class ServletActualizarTrabajador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doput(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        Trabajador t=new Trabajador(new Integer(request.getParameter("idtrabajador")),request.getParameter("nombre"), request.getParameter("paterno"), request.getParameter("materno"));
DAOTrabajador dao=new DAOTrabajador();
out.println(dao.actualizar(t));
        
        
       
    }

}
