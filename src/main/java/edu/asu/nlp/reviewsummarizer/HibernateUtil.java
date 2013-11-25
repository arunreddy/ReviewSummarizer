package edu.asu.nlp.reviewsummarizer;

/**
 * Created by arun on 11/22/13.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    private static Session session;

    static {
        try {
            // A SessionFactory is set up once for an application
            sessionFactory = new Configuration()
                    .configure() // configures settings from hibernate.cfg.xml
                    .buildSessionFactory();

        } catch (Exception e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public static void createRecord(Object obj){
        try {
            if(session==null){
                SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
                session=sessionFactory.openSession();
            }

            session.beginTransaction();
            session.save(obj);
            session.getTransaction().commit();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public static void closeSession(){
        if(session!=null){
            session.close();
        }
    }
}