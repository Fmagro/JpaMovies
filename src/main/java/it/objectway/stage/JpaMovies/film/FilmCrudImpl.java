package it.objectway.stage.JpaMovies.film;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.objectway.stage.JpaMovies.EntityManagerUtil;
import it.objectway.stage.JpaMovies.entity.Film;

public class FilmCrudImpl implements FilmCrud{

	private static EntityManager em;
	
	static{
		em = EntityManagerUtil.getEntityManager();
		
	}
	
	public List<Film> findAllFilms() {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery(Film.FIND_ALL);
		return query.getResultList();
	}

	public Film saveFilm(Film film) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(film);
		em.getTransaction().commit();
		return film;
	}

	public Film updateFilm(Film film) {
		em.getTransaction().begin();
		em.merge(film);
		em.getTransaction().commit();
		return film;
	}

	public Film findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Film.class, id);
	}
	
	public List<Film> findAnimazione(){
		Query query = em.createQuery("SELECT f FROM Film f LEFT OUTER JOIN f.recita r WHERE r.id_film is null");
		
		return query.getResultList();
	}

	
}
