package jp.bctech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private int id;
	private int receiptId;
	private String name;
	private double price;
	private String createdAt;
	private String updateAt;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setReceiptId(int id) {
		this.id = id;
	}
	
	public int getReceiptId() {
		return receiptId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	
	public String getUpdateAt() {
		return updateAt;
	}
}
