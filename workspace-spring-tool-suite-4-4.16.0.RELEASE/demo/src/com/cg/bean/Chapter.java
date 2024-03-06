package com.cg.bean;

public class Chapter {
	public Chapter(int cid, String cname, int bid, int nop) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bid = bid;
		this.nop = nop;
	}
	public Chapter() {
		
	}
	//cid int ,cname String ,int bid fk(bid),int numberof pages
	int cid;
	String cname;
	int bid;
	int nop;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getNop() {
		return nop;
	}
	public void setNop(int nop) {
		this.nop = nop;
	}
	@Override
	public String toString() {
		return "Chapter [cid=" + cid + ", cname=" + cname + ", bid=" + bid + ", nop=" + nop + "]";
	}
	
	
	

}
