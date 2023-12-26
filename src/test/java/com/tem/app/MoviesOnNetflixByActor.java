package com.tem.app;

import java.util.ArrayList;
import java.util.List;

public class MoviesOnNetflixByActor {

	
	private List<MovieByActor> movieList = new ArrayList<>();
	private List<MovieByActor> foundList = new ArrayList<>();
	
	/*
	 * 
	 * @params movie
	 * 	  
	 */
	public void setMovieByActorList(MovieByActor movieByActor) {
		movieList.add(movieByActor);
	}

	/*
	 * 
	 * @params actor
	 * @return foundList
	 * 	  
	 */
	
	public List<MovieByActor> getMovieByActorList(String actor) {
		
		for (MovieByActor MovieByActor : movieList) {
			if(MovieByActor.getActor().equals(actor)) {
				foundList.add(MovieByActor);
				continue;
			}
		}
		
		return foundList;
		
	}
	
	
	
}
