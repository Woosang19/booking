package com.test.domain;

import java.sql.Timestamp;

public class BookingVO {
	
	private int no;
	private int room_no;
	private String name;
	private String phone;
	private String adult;
	private String child;
	private String start_date;
	private String end_date;
	private String options;
	private String payment_flag;
	private int total_cost;
	private String cancel_flag;
	private String bank_name;
	private String bank_branch_code;
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
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdult() {
		return adult;
	}
	public void setAdult(String adult) {
		this.adult = adult;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getPayment_flag() {
		return payment_flag;
	}
	public void setPayment_flag(String payment_flag) {
		this.payment_flag = payment_flag;
	}
	public int getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
	public String getCancel_flag() {
		return cancel_flag;
	}
	public void setCancel_flag(String cancel_flag) {
		this.cancel_flag = cancel_flag;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_branch_code() {
		return bank_branch_code;
	}
	public void setBank_branch_code(String bank_branch_code) {
		this.bank_branch_code = bank_branch_code;
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
