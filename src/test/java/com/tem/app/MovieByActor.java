package com.tem.app;

public class MovieByActor extends Movie{
	

	private String actor;
	
	public MovieByActor(String movie, String actor) {
		super(movie);
		this.actor = actor;
	}
	
	
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	

}
