package com.kartik.springRest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
	private int id;
	private String cname;
	private String cdescription;
	public Course(int id, String cname, String cdescription) {
		super();
		this.id = id;
		this.cname = cname;
		this.cdescription = cdescription;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", cdescription=" + cdescription + "]";
	}
	
	
}
