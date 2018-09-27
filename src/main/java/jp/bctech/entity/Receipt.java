package jp.bctech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Receipt {
	@Id
	private int id;
	private String receiptAt;
	private String tel;
	private double totalPrice;
	private double adjustPrice;
	private String imagePath;
	private String createdAt;
	private String updateAt;
	private String hash;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getReceiptAt() {
		return receiptAt;
	}
	
	public void setReceiptAt(String receiptAt) {
		this.receiptAt = receiptAt;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
		
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void setAdjustPrice(double adjustPrice) {
		this.adjustPrice = adjustPrice;
	}
	
	public double getAdjustPrice() {
		return adjustPrice;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getImagePath() {
		return imagePath;
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
	
	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String getHash() {
		return hash;
	}
}
