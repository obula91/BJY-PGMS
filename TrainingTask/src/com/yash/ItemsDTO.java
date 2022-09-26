package com.yash;

import java.time.LocalDateTime;

public class ItemsDTO {

	String iname; 
	
	float price;

	public ItemsDTO(String iname, float price) {
		super();
		this.iname = iname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemsDTO [iname=" + iname + ", price=" + price + "]";
	}
	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
