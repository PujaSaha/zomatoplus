/*package com.thinkxfactor.zomatoplus.models;

public class Items {
	private String itemID;
	public String getItemID() {
		return itemID;
	}
public Items(String itemID) {
	super();
	this.itemID=itemID;
}
public void setItemId(String itemID) {
	this.itemID=itemID;
}
public Items() {
	super();
}


}*/

package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "tbl_items")
public class Items implements Serializable{
@Id
@GeneratedValue
@Column(name = "item_id")
private Long id;
 
@Column(name="restaurant_id")
private String restaurantId;


public String getRestaurantId() {
	return restaurantId;
}

public void setRestaurantId(String restaurantId) {
	this.restaurantId = restaurantId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public void setId(Long id) {
	this.id = id;
}

@Column(name="name")
private String name;


@Column(name="price")
private Double price;


@Column(name="description")
private String description;

public Long getId() {
	return id;
	
}
}
