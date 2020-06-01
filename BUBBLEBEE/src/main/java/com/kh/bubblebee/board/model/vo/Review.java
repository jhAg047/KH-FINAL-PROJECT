package com.kh.bubblebee.board.model.vo;

import java.sql.Date;

public class Review {
	
	private int qno; //후기번호
	private String qcontent; //내용
	private Date q_create_date; //작성날짜
	private Date q_modify_date; //수정날짜
	private String q_status; //상태
	private int ref_fid; //모임번호
	private String user_id; //작성자
	private String secret_yn; //비밀여부
	private int grade; //평점
	
	public Review() {}

	public Review(int qno, String qcontent, Date q_create_date, Date q_modify_date, String q_status, int ref_fid,
			String user_id, String secret_yn, int grade) {
		super();
		this.qno = qno;
		this.qcontent = qcontent;
		this.q_create_date = q_create_date;
		this.q_modify_date = q_modify_date;
		this.q_status = q_status;
		this.ref_fid = ref_fid;
		this.user_id = user_id;
		this.secret_yn = secret_yn;
		this.grade = grade;
	}

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public Date getQ_create_date() {
		return q_create_date;
	}

	public void setQ_create_date(Date q_create_date) {
		this.q_create_date = q_create_date;
	}

	public Date getQ_modify_date() {
		return q_modify_date;
	}

	public void setQ_modify_date(Date q_modify_date) {
		this.q_modify_date = q_modify_date;
	}

	public String getQ_status() {
		return q_status;
	}

	public void setQ_status(String q_status) {
		this.q_status = q_status;
	}

	public int getRef_fid() {
		return ref_fid;
	}

	public void setRef_fid(int ref_fid) {
		this.ref_fid = ref_fid;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getSecret_yn() {
		return secret_yn;
	}

	public void setSecret_yn(String secret_yn) {
		this.secret_yn = secret_yn;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Review [qno=" + qno + ", qcontent=" + qcontent + ", q_create_date=" + q_create_date + ", q_modify_date="
				+ q_modify_date + ", q_status=" + q_status + ", ref_fid=" + ref_fid + ", user_id=" + user_id
				+ ", secret_yn=" + secret_yn + ", grade=" + grade + "]";
	}
	
	
	
	

}