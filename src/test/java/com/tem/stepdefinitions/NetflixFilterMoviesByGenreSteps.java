package com.tem.stepdefinitions;

import java.util.List;

import com.tem.app.Login;
import com.tem.app.Movie;
import com.tem.app.MovieByGenre;
import com.tem.app.MoviesOnNetflixByActor;
import com.tem.app.MoviesOnNetflixByGenre;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NetflixFilterMoviesByGenreSteps {
	
	
	MovieByGenre movieByGenre;
	MoviesOnNetflixByGenre moviesOnNetflix = new MoviesOnNetflixByGenre();
	int movieOnNetflixByActorCount;


	@And("I have the following movies by genre on Netflix")
	public void i_have_the_following_movies_on_netflix(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		List<List<String>> rows =  dataTable.asLists(String.class);
		for (List<String> list : rows) {
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			movieByGenre = new MovieByGenre(list.get(0), list.get(1));
			moviesOnNetflix.setMovieByGenreList(movieByGenre);
		}
	   
	}

	@When("I search for movies by genre {string}")
	public void i_search_for_movies_by_genre(String actor) {
	   
		 movieOnNetflixByActorCount = moviesOnNetflix.getMovieByGenreList(actor).size();
		 System.out.println("movieOnNetflixByActorCount : "+ movieOnNetflixByActorCount);
	}

	@Then("I find number of movies {string} by Genre")
	public void i_find_number_of_movies(String expected) {
		
		try {
			Assert.assertEquals(Integer.parseInt(expected), movieOnNetflixByActorCount);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
	   
	}



	
}
