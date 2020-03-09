package com.example.demo.model;

public class Equation {
	private Long id;
	private String formula;

	public Equation(String formula) {
		super();
		this.formula = formula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

}
