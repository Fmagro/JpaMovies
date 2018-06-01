package it.objectway.stage.JpaMovies.recita;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.objectway.stage.JpaMovies.EntityManagerUtil;
import it.objectway.stage.JpaMovies.entity.Recita;

public class RecitaCrudImpl implements RecitaCrud{

	private static EntityManager em;
	
	static {
		em = EntityManagerUtil.getEntityManager();
	}
	
	public List<Recita> findAllRecita() {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery(Recita.FIND_ALL);
		return query.getResultList();
	}

	public Recita saveRecita(Recita recita) {
		em.getTransaction().begin();
		em.persist(recita);
		em.getTransaction().commit();
		return recita;
	}

	public Recita updateRecita(Recita recita) {
		em.getTransaction().begin();
		em.merge(recita);
		em.getTransaction().commit();
		return recita;
	}

	public Recita findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Recita.class, id);
	}

}
