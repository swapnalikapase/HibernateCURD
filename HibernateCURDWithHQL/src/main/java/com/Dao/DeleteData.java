package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entities.*;

public class DeleteData {

	
	 public void deletedata(){
	 
	 Configuration cfg = new Configuration(); cfg.configure();
	 cfg.addAnnotatedClass(library.class); SessionFactory
	 sf=cfg.buildSessionFactory(); Session ss=sf.openSession(); Transaction
	 tr=ss.beginTransaction(); int id =1; library l=ss.get(library.class, id);
	 ss.remove(l);
	  
	  }
	 
}
