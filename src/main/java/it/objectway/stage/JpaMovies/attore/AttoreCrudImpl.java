package it.objectway.stage.JpaMovies.attore;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.objectway.stage.JpaMovies.EntityManagerUtil;
import it.objectway.stage.JpaMovies.entity.Attore;

public class AttoreCrudImpl implements AttoreCrud{

	private static EntityManager em;
	private Integer annoMaggiorenni = 2000;

	static {
		em = EntityManagerUtil.getEntityManager();
	}
	
	public List<Attore> findAllAttori() {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery(Attore.FIND_ALL);
		return query.getResultList();
	}

	public Attore saveAttore(Attore attore) {
		em.getTransaction().begin();
		em.persist(attore);
		em.getTransaction().commit();
		return attore;
	}

	public Attore updateAttore(Attore attore) {
		em.getTransaction().begin();
		em.merge(attore);
		em.getTransaction().commit();
		return attore;
	}

	public Attore findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Attore.class, id);
	}

	public List<Attore> findMinorenni(){
		Query query = em.createQuery("SELECT a FROM Attore a WHERE anno_nascita > :annoMaggiorenni");
		query.setParameter("annoMaggiorenni", annoMaggiorenni);
		
		return query.getResultList();
	}
	
	
}
