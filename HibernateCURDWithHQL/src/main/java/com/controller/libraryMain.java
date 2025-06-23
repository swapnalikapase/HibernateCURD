package com.controller;
import com.service.*;
public class libraryMain {

	public static void main(String[] args) {
		LibraryService l=new LibraryService();
		
        l.insertdata();
         l.updatedata();
       l.deletedata();
	}

}
