package com.day5;

public class Movie extends Ott {
	String dateReleased;
	String type;
	
	Movie[] movieAry = new Movie [10];
	int accountposition=0;
	
	
	
	public Movie (String name, String Content, String dateRelesed) {
		Movie account = new Movie ( name, content, dateReleased);
		movieAry[accountposition]= account;
		accountposition++;
	}
	
	public void removeMovie(int position) {
		
		movieAry[position]= null;
		
		
	}
	
	public void getMyMovieName(String name) {
		this.name= "name";
		
	}
	
	public Movie getmyaccountPosition (int position) {
		Movie requestedMovie = movieAry[position];
		return requestedMovie;
	}
	
    public void updatedMovie(String updatedMovie) {
    	type=updatedMovie;
    }
    
         
	
          
    
}
