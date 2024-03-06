package com.cg.bean;

public class Publisher {
	String pname;
	int pid;
	int numberofbooks;
	Book book;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getNumberofbooks() {
		return numberofbooks;
	}
	public void setNumberofbooks(int numberofbooks) {
		this.numberofbooks = numberofbooks;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Publisher [pname=" + pname + ", pid=" + pid + ", numberofbooks=" + numberofbooks + ", book=" + book
				+ "]";
	}

}
