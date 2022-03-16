package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Filiere_Langue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String codeFiliereLangue;
    private String nomFiliereLangue;
    /**
     * association avec la table composante
     */
    @OneToOne
    private Composante depend_De;

    /**
     * association avec la table cours
     */
    @OneToMany(mappedBy = "Id")
    private List<Cours> coursList;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCodeFiliereLangue() {
		return codeFiliereLangue;
	}

	public void setCodeFiliereLangue(String codeFiliereLangue) {
		this.codeFiliereLangue = codeFiliereLangue;
	}

	public String getNomFiliereLangue() {
		return nomFiliereLangue;
	}

	public void setNomFiliereLangue(String nomFiliereLangue) {
		this.nomFiliereLangue = nomFiliereLangue;
	}

	public Composante getDepend_De() {
		return depend_De;
	}

	public void setDepend_De(Composante depend_De) {
		this.depend_De = depend_De;
	}

	public List<Cours> getCoursList() {
		return coursList;
	}

	public void setCoursList(List<Cours> coursList) {
		this.coursList = coursList;
	}
}
