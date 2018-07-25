package icehs.science.chapter07;

public class Movie {
	String tittle;
	String director;
	String genre;
	
	
	Movie(){
		
	}
	
	Movie(String title, String director){
		this.tittle = title;
		this.director = director;
		
	}

	public Movie(String tittle, String director, String genre) {
		super();
		this.tittle = tittle;
		this.director = director;
		this.genre = genre;
	}

}
