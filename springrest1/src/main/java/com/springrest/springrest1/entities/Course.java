package com.springrest.springrest1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	private String title;
	private String desc;
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", desc=" + desc + ", getId()=" + getId() + ", getTitle()="
				+ getTitle() + ", getDesc()=" + getDesc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(long id, String title, String desc) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
	}
}
