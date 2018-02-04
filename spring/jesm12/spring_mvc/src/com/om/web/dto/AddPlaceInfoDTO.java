package com.om.web.dto;

import java.io.Serializable;

public class AddPlaceInfoDTO implements Serializable {

	private String name;
	private int rating;
	//<input type="text" name="food"/>
	private String food;
	private String desc;
	private String popular;

	public AddPlaceInfoDTO() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPopular() {
		return popular;
	}

	public void setPopular(String popular) {
		this.popular = popular;
	}

	@Override
	public String toString() {
		return "AddPlaceInfoDTO [name=" + name + ", rating=" + rating + ", food=" + food + ", desc=" + desc
				+ ", popular=" + popular + "]";
	}

}
