package com.demo;

import com.dtos.Filiere_LangueDto;
import com.dtos.GestionnaireDto;
import com.dtos.ResponsableDto;
import com.entities.Seance_Formation;
import com.services.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class DemoApplicationTests {

	@Autowired
	GestionnaireServiceImpl gestionnaireService;
	@Autowired
	ResponsableServiceImpl responsableService;
	@Autowired
	VacataireServiceImpl vacataireService;
	Seance_FormationServiceImpl seance_formationService;
	@Autowired
	Filiere_LangueServiceImpl filiere_langueService;
	CreneauServiceImpl creneauService;
	CoursServiceImpl coursService;
	@Autowired
	ComposanteServiceImpl composanteService;
/*	@Test
	void addGestionnaire() {
		GestionnaireDto gestionnaireDto = new GestionnaireDto();
		gestionnaireDto.setId(null);
		gestionnaireDto.setPrenom("Hossam");
		gestionnaireDto.setNomUsuel("Ouldsouilem");
		gestionnaireDto.setMail("toto@gmail.com");
		gestionnaireDto.setLogin("oshisa");
		gestionnaireDto.setMotDePasse("1234");
		gestionnaireService.enregistrerGestionnaire(gestionnaireDto);
	}
	*/
@Test
	void add () {
		Filiere_LangueDto filierelanguedto = new Filiere_LangueDto();
		filierelanguedto.setCodeFiliereLangue("totootot");
		filierelanguedto.setNomFiliereLangue("ttitiitit");
		filierelanguedto.setDepend_De(null);
	}
	


}
