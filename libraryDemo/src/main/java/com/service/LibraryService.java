package com.service;
import com.Dao.*;
public class LibraryService {
DeleteData d=new DeleteData();
InsertData i=new InsertData();
UpdateData u=new UpdateData();



  public void deletedata() { 
	  d.deletedata(); 
	  }
 
public void insertdata() {
	i.insertdata();
}
public void updatedata() {
	u.updatedata();
}
}
