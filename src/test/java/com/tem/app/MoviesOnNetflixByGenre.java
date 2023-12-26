package com.tem.app;

import java.util.ArrayList;
import java.util.List;

public class MoviesOnNetflixByGenre {

	
	private List<MovieByGenre> movieList = new ArrayList<>();
	private List<MovieByGenre> foundList = new ArrayList<>();
	
	/*
	 * 
	 * @params movie
	 * 	  
	 */
	public void setMovieByGenreList(MovieByGenre MovieByGenre) {
		movieList.add(MovieByGenre);
	}

	/*
	 * 
	 * @params actor
	 * @return foundList
	 * 	  
	 */
	
	public List<MovieByGenre> getMovieByGenreList(String genre) {
		
		for (MovieByGenre MovieByGenre : movieList) {
			if(MovieByGenre.getGenre().equals(genre)) {
				foundList.add(MovieByGenre);
				continue;
			}
		}
		
		return foundList;
		
	}
	
	
	
}
