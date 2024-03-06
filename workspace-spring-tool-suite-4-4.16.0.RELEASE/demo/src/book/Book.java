package book;

public class Book {
	public Book(int pid, int bid, String bname, float price) {
		super();
		this.pid = pid;
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
	public Book() {
		
	}

	int pid;
	int bid;
	String bname;
	float price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [pid=" + pid + ", bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	

}
