package com.om.backup.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports_table")
public class SportDTO implements Serializable {

	@Id
	@Column(name="sport_id")
	private int sportId;
	@Column(name="sports_name")
	private String name;
	@Column(name="sports_type")
	private String type;
	@Column(name="sports_team_size")
	private int teamsize;

	public SportDTO() {
		System.out.println("SportDTO created...");
	}

	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

}
