package it.objectway.stage.JpaMovies.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries({
	@NamedQuery(name = Recita.FIND_ALL, query = "SELECT r FROM Recita r"),
})

@Entity
public class Recita implements Serializable{

	public static final String FIND_ALL = "it.objectway.stage.JpaMovies.recita.Recita.find_all";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Film id_film;
	@ManyToOne
	private Attore id_attore;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Film getId_film() {
		return id_film;
	}
	public void setId_film(Film id_film) {
		this.id_film = id_film;
	}
	public Attore getId_attore() {
		return id_attore;
	}
	public void setId_attore(Attore id_attore) {
		this.id_attore = id_attore;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recita other = (Recita) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id_attore == null) {
			if (other.id_attore != null)
				return false;
		} else if (!id_attore.equals(other.id_attore))
			return false;
		if (id_film == null) {
			if (other.id_film != null)
				return false;
		} else if (!id_film.equals(other.id_film))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Recita [id=" + id + " Attore : " + id_attore.getNome() + " Film : " + id_film.getNome() + " ]"; 
	}
	
	
	
}
