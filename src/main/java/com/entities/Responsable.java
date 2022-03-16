package com.entities;

import lombok.Data;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@DiscriminatorColumn(name = "R")
public class Responsable extends Utilisateur{
    /**
     * association avec la table composante
     */
    @OneToOne
    private Composante est_Rattache_A;

	public Composante getEst_Rattache_A() {
		return est_Rattache_A;
	}

	public void setEst_Rattache_A(Composante est_Rattache_A) {
		this.est_Rattache_A = est_Rattache_A;
	}
}
