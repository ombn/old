package com.ria.hibernate.manytomany;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="course")
public class CoursesDTO 
{
	@Id
	@GenericGenerator(name="cname",strategy="increment")
	@GeneratedValue(generator="cname")
	@Column(name="col_id")
  private int cid;
	@Column(name="col_name")
  private String cname;
	@Column(name="col_fee")
  private double cfee;
	@ManyToMany(cascade=CascadeType.ALL)
  private Collection<InstiStudentDTO> collection;
  
  public CoursesDTO()
  {
	  System.out.println(this.getClass().getName()+"created");
  }

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public double getCfee() {
	return cfee;
}

public void setCfee(double cfee) {
	this.cfee = cfee;
}

public Collection<InstiStudentDTO> getCollection() {
	return collection;
}

public void setCollection(Collection<InstiStudentDTO> collection) {
	this.collection = collection;
}
  
}
