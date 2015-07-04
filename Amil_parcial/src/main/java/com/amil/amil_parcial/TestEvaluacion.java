package com.amil.amil_parcial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestEvaluacion {
    
    public static void main(String[] args) throws Exception{
        
        System.out.println("Vamos a probar todas las operaciones SQL");
          
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
                
        Session sesion = factory.openSession();
        
        Transaction tranza = sesion.beginTransaction();
        
        Evaluacion e = new Evaluacion();
                
        DAOApoyo daoa = new DAOApoyo();
        
        daoa.guardar(e);
        
        
    }
    
}
