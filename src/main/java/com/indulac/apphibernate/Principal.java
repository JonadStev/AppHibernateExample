package com.indulac.apphibernate;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



/**
 *
 * @author jburgos
 */
public class Principal {

    public static void main(String[] args) {
        Session ss = getCurrentSessionFromConfig();
        try {
            ss.beginTransaction();
            
            // Crear usuarios
            
            /*
            Usuario uu = new Usuario();
            uu.setEmail("jburgos@indulac.com");
            uu.setNombre("Jonathan burgos");
            uu.setPrioridad(1);
            ss.save(uu);
            */
            
            List<Usuario> usuarios = ss.createQuery("FROM Usuario").list();
            
            Usuario u = usuarios.stream().filter(x -> x.getId() == 1)
                    .map(x -> x)
                    .findFirst()
                    .orElse(null);
            
            System.out.println("ID encontrado: "+ u.getId());
            
            usuarios.forEach(usuario ->{
                System.out.println("ID: " + usuario.getId());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Nombre: " + usuario.getNombre());
            });
            
            ss.getTransaction().commit();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ss.close(); 
        }  
    }
    
    public static Session getCurrentSessionFromConfig() {
        
        // SessionFactory in Hibernate 5 example
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        // local SessionFactory bean created
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); //sessionFactory.getCurrentSession();
        return session;
    }
}
