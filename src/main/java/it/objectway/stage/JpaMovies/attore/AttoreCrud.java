package it.objectway.stage.JpaMovies.attore;

import java.util.List;

import it.objectway.stage.JpaMovies.entity.Attore;

public interface AttoreCrud {
	
	List<Attore> findAllAttori();
	
	Attore saveAttore(Attore attore);
	
	Attore updateAttore(Attore attore);
	
	Attore findById(Long id);
	
	List<Attore> findMinorenni();
}
