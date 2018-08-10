package com.cg.spring.dto;


@Entity
@table
public class Query {
	@Id
	@column(name="query_id")
	int id;
	@column(name="technology")
	String technology;
	@column(name="query_raised_by")
	String query_raised_by;
	@column(name="query")
	String query;
	@column(name="solutions")
	String solutions;
	@column(name="solution_given_by")
	String solution_given_by;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuery_raised_by() {
		return query_raised_by;
	}
	public void setQuery_raised_by(String query_raised_by) {
		this.query_raised_by = query_raised_by;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSolutions() {
		return solutions;
	}
	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}
	public String getSolution_given_by() {
		return solution_given_by;
	}
	public void setSolution_given_by(String solution_given_by) {
		this.solution_given_by = solution_given_by;
	}
	@Override
	public String toString() {
		return "Query [id=" + id + ", technology=" + technology + ", query_raised_by=" + query_raised_by + ", query="
				+ query + ", solutions=" + solutions + ", solution_given_by=" + solution_given_by + "]";
	}
	

}
