package com.test.domain;

import java.sql.Timestamp;

public class Room_infoVO {
	
	private int no;
	private String room_num;
	private String room_title;
	private int max;
	private int adult_cost;
	private int child_cost;
	private String explanation;
	private String images;
	private String color_code;
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
	public String getRoom_num() {
		return room_num;
	}
	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}
	public String getRoom_title() {
		return room_title;
	}
	public void setRoom_title(String room_title) {
		this.room_title = room_title;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getAdult_cost() {
		return adult_cost;
	}
	public void setAdult_cost(int adult_cost) {
		this.adult_cost = adult_cost;
	}
	public int getChild_cost() {
		return child_cost;
	}
	public void setChild_cost(int child_cost) {
		this.child_cost = child_cost;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getColor_code() {
		return color_code;
	}
	public void setColor_code(String color_code) {
		this.color_code = color_code;
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
