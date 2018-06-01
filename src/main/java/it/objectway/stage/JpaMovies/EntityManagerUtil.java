package it.objectway.stage.JpaMovies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	private static EntityManager entityManager;
	private static EntityManagerFactory emFactory;

	private EntityManagerUtil() {
	}

	public static EntityManager getEntityManager() {
		if(entityManager==null){
			emFactory = Persistence.createEntityManagerFactory("jpa-example");
			entityManager = emFactory.createEntityManager();
		}
		return entityManager;
	}
	
	public static void close() {
		entityManager.close();
		emFactory.close();
	}
}
