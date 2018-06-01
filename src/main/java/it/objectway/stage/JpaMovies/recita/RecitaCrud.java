package it.objectway.stage.JpaMovies.recita;

import java.util.List;

import it.objectway.stage.JpaMovies.entity.Recita;

public interface RecitaCrud {

	List<Recita> findAllRecita();
	
	Recita saveRecita(Recita recita);
	
	Recita updateRecita(Recita recita);
	
	Recita findById(Long id);
}
