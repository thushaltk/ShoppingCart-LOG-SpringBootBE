package com.logshop.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemID;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "img_url")
	private String imageUrl;

	@Column(name = "price")
	private double price;
	
	@Column(name = "s_nic")
	private String sellerNic;
	
	@Column(name = "s_name")
	private String sellerName;
	
	

	public Items() {
		super();
	}



	public Items(long itemID, String itemName, String description, String imageUrl, double price,
			String sellerNic, String sellerName) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.description = description;
		this.imageUrl = imageUrl;
		this.price = price;
		this.sellerNic = sellerNic;
		this.sellerName = sellerName;
	}



	public long getItemID() {
		return itemID;
	}



	public void setItemID(long itemID) {
		this.itemID = itemID;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getSellerNic() {
		return sellerNic;
	}



	public void setSellerNic(String sellerNic) {
		this.sellerNic = sellerNic;
	}



	public String getSellerName() {
		return sellerName;
	}



	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	
	
	
}
