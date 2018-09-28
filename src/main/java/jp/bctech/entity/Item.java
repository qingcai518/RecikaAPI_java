package jp.bctech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private Long id;
	private Long receiptId;
	private String name;
	private Double price;
	private String createdAt;
	private String updateAt;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setReceiptId(Long receiptId) {
		this.receiptId = receiptId;
	}
	
	public Long getReceiptId() {
		return receiptId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
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
