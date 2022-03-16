package com.entities;

import lombok.Data;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@DiscriminatorColumn(name = "V")
public class Vacataire extends Utilisateur{

    @OneToMany(mappedBy = "Id")
    private List<Seance_Formation> effectue;

    @OneToMany(mappedBy = "Id")
    private List<Cours> participe_A;

	public List<Seance_Formation> getEffectue() {
		return effectue;
	}

	public void setEffectue(List<Seance_Formation> effectue) {
		this.effectue = effectue;
	}

	public List<Cours> getParticipe_A() {
		return participe_A;
	}

	public void setParticipe_A(List<Cours> participe_A) {
		this.participe_A = participe_A;
	}
}
