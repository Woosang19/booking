package com.test.domain;

import java.sql.Timestamp;

public class NoticeVO {
	
	private int no;
	private String title;
	private String contents;
	private String delete_flag;
	private Timestamp created_at;
	private Timestamp updated_at;
	private int build_code;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(String delete_flag) {
		this.delete_flag = delete_flag;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	public int getBuild_code() {
		return build_code;
	}
	public void setBuild_code(int build_code) {
		this.build_code = build_code;
	}
	
	
}
