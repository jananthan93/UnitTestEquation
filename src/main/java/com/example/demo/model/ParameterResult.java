package com.example.demo.model;

public class ParameterResult {
	private Long id;
	private String name;
	private String abbrebiation;
	private Double value;
	
	public ParameterResult(Long id, String abbrebiation, Double value) {
		super();
		this.id = id;
		this.abbrebiation = abbrebiation;
		this.value = value;
	}
	
	public ParameterResult(Long id, String name, String abbrebiation, Double value) {
		super();
		this.id = id;
		this.name = name;
		this.abbrebiation = abbrebiation;
		this.value = value;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbrebiation() {
		return abbrebiation;
	}
	public void setAbbrebiation(String abbrebiation) {
		this.abbrebiation = abbrebiation;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
}
