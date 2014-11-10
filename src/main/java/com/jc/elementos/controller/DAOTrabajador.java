/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.elementos.controller;

import com.jc.elementos.model.Trabajador;
import com.jc.elementos.model.Utilidadeshibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ricardo.huarte
 */
public class DAOTrabajador {
    
    public String guardar(Trabajador t){
         //pasos para la transacción
        SessionFactory factory=Utilidadeshibernate.getSessionFactory();
        
        Session sesion= factory.openSession();
        
        Transaction tx=  sesion.beginTransaction();
        
        sesion.save(t);
tx.commit();
factory.close();
return "trabajador guardado";
    }
    
    public String actualizar(Trabajador t){
         //pasos para la transacción
        SessionFactory factory=Utilidadeshibernate.getSessionFactory();
        
        Session sesion= factory.openSession();
        
        Transaction tx=  sesion.beginTransaction();
    
       
        sesion.update(t);
tx.commit();
factory.close();
return "trabajador guardado";
    }
    
    
}
    

