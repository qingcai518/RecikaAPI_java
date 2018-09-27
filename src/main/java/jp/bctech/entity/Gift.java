package jp.bctech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gift {
	@Id
	private int id;
	private String name;
	private String detail;
	private String thumbnail;
	private double price;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	public String getThumbnail() {
		return thumbnail;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
