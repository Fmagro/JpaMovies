package it.objectway.stage.JpaMovies.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import it.objectway.stage.JpaMovies.recita.RecitaCrud;
import it.objectway.stage.JpaMovies.recita.RecitaCrudImpl;

@NamedQueries({
	@NamedQuery(name = Film.FIND_ALL, query = "SELECT f FROM Film f"),
})

@Entity
public class Film implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "it.objectway.stage.JpaMovies.Film.find_all";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Column
	private Integer anno;
	@Column
	private Integer costo;
	@Column
	private Integer incasso;
	@OneToMany(mappedBy = "id_film")
	private Set<Recita> recita;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	public Integer getCosto() {
		return costo;
	}
	public void setCosto(Integer costo) {
		this.costo = costo;
	}
	public Integer getIncasso() {
		return incasso;
	}
	public void setIncasso(Integer incasso) {
		this.incasso = incasso;
	}

	
	public Set<Recita> getRecita() {
		return recita;
	}
	
	public void setRecita(Set<Recita> recita){
		this.recita = recita;
	}
	
	public void addRecita(Recita recita) {
		if(this.recita == null) {
			this.recita = new HashSet<Recita>();
		}
		this.recita.add(recita);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anno == null) ? 0 : anno.hashCode());
		result = prime * result + ((costo == null) ? 0 : costo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((incasso == null) ? 0 : incasso.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Film other = (Film) obj;
		if (anno == null) {
			if (other.anno != null)
				return false;
		} else if (!anno.equals(other.anno))
			return false;
		if (costo == null) {
			if (other.costo != null)
				return false;
		} else if (!costo.equals(other.costo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (incasso == null) {
			if (other.incasso != null)
				return false;
		} else if (!incasso.equals(other.incasso))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (recita == null) {
			if (other.recita != null)
				return false;
		} else if (!recita.equals(other.recita))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", nome=" + nome + ", anno=" + anno + ", costo=" + costo + ", incasso=" + incasso
				+ ", recita=" + recita + "]";
	}
	
	
}
