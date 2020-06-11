package com.kh.bubblebee.board.model.vo;

public class Option {

	private String ono;			//옵션 번호
	private String oname;		//옵션 이름
	private String price;		//옵션 가격
	private String ocount;			//수량
	private int fno;			//게시판 번호
	
	public Option() {}

	public Option(String oname, String price, String ocount) {
		super();
		this.oname = oname;
		this.price = price;
		this.ocount = ocount;
	}

	public Option(String ono, String oname, String price, String ocount, int fno) {
		super();
		this.ono = ono;
		this.oname = oname;
		this.price = price;
		this.ocount = ocount;
		this.fno = fno;
	}

	public String getOno() {
		return ono;
	}

	public void setOno(String ono) {
		this.ono = ono;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getprice() {
		return price;
	}

	public void setprice(String price) {
		this.price = price;
	}

	public String getOcount() {
		return ocount;
	}

	public void setOcount(String ocount) {
		this.ocount = ocount;
	}

	public int getFno() {
		return fno;
	}

	public void setFno(int fno) {
		this.fno = fno;
	}

	@Override
	public String toString() {
		return "Option [ono=" + ono + ", oname=" + oname + ", price=" + price + ", ocount="
				+ ocount + ", fno=" + fno + "]";
	}
	
	
	
	
}
