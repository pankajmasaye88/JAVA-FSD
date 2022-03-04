package com.simplilearn.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Main {
    public static void main(String[] args) {
        
        StandardServiceRegistry registery= 
               new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata= new MetadataSources(registery).getMetadataBuilder().build();
        
        SessionFactory factory= metadata.getSessionFactoryBuilder().build();
        
        Session session= factory.openSession();
  
        Student s1 = new Student("B","D","H@gmail.com","H3");
        Transaction t= session.beginTransaction();
        session.save(s1);
        t.commit();
        System.out.println("Data Inserted");
        
        Student s2= new Student("E"," H"," R@gmail.com","R3");   
        Transaction t1= session.beginTransaction();
        session.save(s2);
        t1.commit();
        System.out.println("Data Inserted");
        	
        Student s3= new Student("B"," s"," Hn@gmail.com","H3");   
        Transaction t3= session.beginTransaction();
        session.save(s3);
        t3.commit();
        System.out.println("Data Inserted");
        
        
        
        
        
        session.close();
        factory.close();
    }
}