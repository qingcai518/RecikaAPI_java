package jp.bctech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String name;
	private String password;
	private String ownerPubKey;
	private String activePubKey;
	private String memoPubKey;
	private String createdAt;
	private String updateAt;
	
	@Id
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setOwnerPubKey (String ownerPubKey) {
		this.ownerPubKey = ownerPubKey;
	}
	
	public String getOwnerPubKey() {
		return ownerPubKey;
	}
	
	public void setActivePubKey(String activePubKey) {
		this.activePubKey = activePubKey;
	}
	
	public String getActivePubKey() {
		return activePubKey;
	}
	
	public void setMemoPubKey(String memoPubKey) {
		this.memoPubKey = memoPubKey;
	}
	
	public String getMemoPubKey() {
		return memoPubKey;
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
