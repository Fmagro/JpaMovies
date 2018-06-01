package it.objectway.stage.JpaMovies.film;

import java.util.List;

import it.objectway.stage.JpaMovies.entity.Film;

public interface FilmCrud {

	
	List<Film> findAllFilms();
	
	Film saveFilm(Film film);
	
	Film updateFilm(Film film);
	
	Film findById(Long id);
	
	List<Film> findAnimazione();
}
