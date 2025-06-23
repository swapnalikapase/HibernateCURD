package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lData")
public class library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bID;
	String bookName;
	@Column(name = "state")
	String author;
	int pdate;

	public library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public library(int bID, String bookName, String author, int pdate) {
		super();
		this.bID = bID;
		this.bookName = bookName;
		this.author = author;
		this.pdate = pdate;
	}

	public int getbID() {
		return bID;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPdate() {
		return pdate;
	}

	public void setPdate(int pdate) {
		this.pdate = pdate;
	}

	@Override
	public String toString() {
		return "library [bID=" + bID + ", bookName=" + bookName + ", author=" + author + ", pdate=" + pdate + "]";
	}

}