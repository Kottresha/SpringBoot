package com.ltts;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	int movieId;
	String movieName;
	String directorName;
	String heroName;
	String heroienName;
	String langauage;
	LocalDate date;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroienName() {
		return heroienName;
	}

	public void setHeroienName(String heroienName) {
		this.heroienName = heroienName;
	}

	public String getLangauage() {
		return langauage;
	}

	public void setLangauage(String langauage) {
		this.langauage = langauage;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	


}
