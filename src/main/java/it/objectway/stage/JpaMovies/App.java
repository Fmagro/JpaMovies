package it.objectway.stage.JpaMovies;

import java.util.List;

import it.objectway.stage.JpaMovies.EntityManagerUtil;

import it.objectway.stage.JpaMovies.attore.AttoreCrud;
import it.objectway.stage.JpaMovies.attore.AttoreCrudImpl;
import it.objectway.stage.JpaMovies.entity.Attore;
import it.objectway.stage.JpaMovies.entity.Film;
import it.objectway.stage.JpaMovies.entity.Recita;
import it.objectway.stage.JpaMovies.film.FilmCrud;
import it.objectway.stage.JpaMovies.film.FilmCrudImpl;
import it.objectway.stage.JpaMovies.recita.RecitaCrud;
import it.objectway.stage.JpaMovies.recita.RecitaCrudImpl;



/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		FilmCrud filmC = new FilmCrudImpl();

		List<Film> filmList = filmC.findAllFilms();

		for (Film film : filmList) {
			System.out.println(film);
		}

		AttoreCrud attoreC = new AttoreCrudImpl();

		List<Attore> attoreList = attoreC.findAllAttori();

		for (Attore attore : attoreList) {
			System.out.println(attore);
		}

		RecitaCrud recitaC = new RecitaCrudImpl();

		List<Recita> recitaList = recitaC.findAllRecita();

		for (Recita recita : recitaList) {
			System.out.println(recita);
		}
//		
//		Film film = new Film();
//		film.setNome("Biancaneve");
//		film.setAnno(1950);
//		film.setIncasso(300000000);
//		film.setCosto(1000000000);
//		
//		film = filmC.saveFilm(film);
//		
//		Film film = filmC.findById(2L);
//		
//		
//		
//		attore = attoreC.saveAttore(attore);
//		
//		Attore attore = attoreC.findById(6L);
//		
//		attore.setSalario(12000000);
//		
//		attore = attoreC.updateAttore(attore);
//		
//		
//		System.out.println(attore);
//		System.out.println(film);
//		
//		
//		recita = recitaC.saveRecita(recita);
//		Attore attore2 = new Attore();
//		
//		attore2.setNome("Josh Brolin Jr");
//		attore2.setAnno_nascita(1995);
//		attore2.setSalario(10000000);
//
//		Recita recita = new Recita();
//		recita.setId_attore(attore2);
//		recita.setId_film(film);
//		
//		attore2.addRecita(recita);
//		
//		attore2 = attoreC.saveAttore(attore2);
//		
//		
//		System.out.println(recita);
		
		
//		Attore attore = attoreC.findById(9L);
//		attore.setAnno_nascita(2010);
//		attore = attoreC.updateAttore(attore);
		
		System.out.println(attoreC.findMinorenni());
		System.out.println(filmC.findAnimazione());
		
		EntityManagerUtil.close();
		System.out.println("done");
	}
}	
