package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entities.*;

public class InsertData {
	public void insertdata() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		 library l=new library(); 
		// l.setbID(4); 
		 l.setBookName("javaww");
		 l.setAuthor("ghj"); 
		 l.setPdate(21);
		 
		 
		library l1 = new library();
		//l1.setbID(2);
		l1.setBookName("java");
		l1.setAuthor("ghwrrj");
		l1.setPdate(21);

		library l2 = new library();
		//l2.setbID(3);
		l2.setBookName("java");
		l2.setAuthor("ghwwj");
		l2.setPdate(21);

		ss.persist(l);
		ss.persist(l1);
		ss.persist(l2);

		
		tr.commit();
		ss.close();
		System.out.println("Data is inserted..........");
	}
}
