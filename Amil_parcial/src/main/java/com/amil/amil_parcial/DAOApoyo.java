package com.amil.amil_parcial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOApoyo {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    public static void abrirSesion() {
        factory = HibernateUtilidades.getSessionFactory();
        session = factory.openSession();
        tranza = session.beginTransaction();
    }

    public static void cerrarSesion() {
        tranza.commit();
        session.close();
    }
    
    public DAOApoyo (){
        
    }
    
    public void guardar(Evaluacion e) throws Exception {
        //Aquí va el código del INSERT, después invocas al método cerrarTodo
        abrirSesion();
        session.save(e);
        cerrarSesion();
    }
    
}
