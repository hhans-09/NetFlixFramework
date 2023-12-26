package com.tem.app;

public class MovieByGenre extends Movie{
	

	private String genre;
	
	public MovieByGenre(String movie, String genre) {
		super(movie);
		this.genre = genre;
	}
	
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
