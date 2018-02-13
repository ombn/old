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
@Table(name="student")
public class InstiStudentDTO 
{
	@Id
	@GenericGenerator(name="name",strategy="increment")
	@GeneratedValue(generator="name")
	@Column(name="std_id")
  private int stdid;
	@Column(name="std_name")
  private String stdname;
	@Column(name="std_branch")
  private String stdbranch;
	@ManyToMany(cascade=CascadeType.ALL)
  private Collection<CoursesDTO> collection;
	
	public InstiStudentDTO()
	{
		System.out.println(this.getClass().getName()+"created");
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStdbranch() {
		return stdbranch;
	}

	public void setStdbranch(String stdbranch) {
		this.stdbranch = stdbranch;
	}

	public Collection<CoursesDTO> getCollection() {
		return collection;
	}

	public void setCollection(Collection<CoursesDTO> collection) {
		this.collection = collection;
	}
  
}
