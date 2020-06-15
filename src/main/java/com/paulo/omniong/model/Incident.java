package com.paulo.omniong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Incident {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	private Integer value;
	private Long ongId;
	
	public Incident(Long id, String title, String description, Integer value, Long ongId) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.value = value;
		this.ongId = ongId;
	}

	public Incident() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Long getOngId() {
		return ongId;
	}

	public void setOngId(Long ongId) {
		this.ongId = ongId;
	}

	@Override
	public String toString() {
		return "Incident [id=" + id + ", title=" + title + ", description=" + description + ", value=" + value
				+ ", ongId=" + ongId + "]";
	}
}
