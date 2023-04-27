package br.com.taking.ProjetoGestaoRH.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Candidato;
import br.com.taking.ProjetoGestaoRH.service.CandidatoService;

@RestController
public class CandidatoController {
	
	@Autowired
	CandidatoService candidatoService;
	
	@RequestMapping(value= "/candidato", method = RequestMethod.GET)

	public ResponseEntity<List<Candidato>> GetALL(){
		
		List<Candidato> resultado = candidatoService.listarTodos();

		return new ResponseEntity<List<Candidato>> (resultado, HttpStatus.OK);
		
	}
	
	//OBTER POR ID
	@RequestMapping(value = "/candidato/{id}", method = RequestMethod.GET)
	public ResponseEntity<Candidato> GetById(@PathVariable(value ="id") int id){
		 Candidato candidato = candidatoService.obterPorId(id);
		 if(candidato != null) {
			 return new ResponseEntity<Candidato>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}
	
	
	//OBTER POR DOCUMENTO
	@RequestMapping(value = "/candidato/identificationdocument/{identificationDocument}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByIdentificationDocument(@PathVariable(value = "identificationDocument") String identification){
		List<Candidato> candidato = candidatoService.findByIdentificationDocument(identification);
		 if(candidato != null) {
			 return new ResponseEntity<>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}  
	
	
	//OBTER POR GENDER
	@RequestMapping(value = "/candidato/gender/{gender}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByGender(@PathVariable(value = "gender") int gender){
		List<Candidato> candidato = candidatoService.obterPorGender(gender);
		if(candidato != null) {
			return new ResponseEntity<List<Candidato>>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}
	
	//OBTER POR INTEREST AREA
	@RequestMapping(value = "/candidato/areaInterest/{area_interest}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByAreaInterest(@PathVariable(value = "area_interest") int area_interest){
		List<Candidato> candidato = candidatoService.obterPorAreaInterest(area_interest);
		if(candidato != null) {
			return new ResponseEntity<List<Candidato>>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}
	
/*
 * 
 * @RequestMapping(value = "/candidato/filter/interesse/{areaInterest_id}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByInteresse(@PathVariable("areaInterest_id") int areaInterest_id) {
    List<Candidato> candidato = candidatoService.findByAreaInteresse(areaInterest_id);
    if(candidato != null) {
        return new ResponseEntity<>(candidato, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
 */
	
	
	/*
	//OBTER POR LOCALIDADE
	@RequestMapping(value = "/candidato/localization/{city}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByCity(@PathVariable(value = "city") int city){
		List<Candidato> candidato = candidatoService.obterPorCity(city);
		if(candidato != null) {
			return new ResponseEntity<List<Candidato>>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}
	
	/*
	//OBTER POR AGE
	@RequestMapping(value = "/candidato/birthdate/{birthdate}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByBirthdate(@PathVariable(value = "birthdate") Date birthdate){
		List<Candidato> candidato = candidatoService.obterPorBirthdate(birthdate);
		if(candidato != null) {
			return new ResponseEntity<List<Candidato>>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}

	//OBTER POR WORK EXPERIENCE
	@RequestMapping(value = "/candidato/workExperience/{workExperience}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByWorkExperience(@PathVariable(value = "workExperience") int workExperience){
		List<Candidato> candidato = candidatoService.obterPorWorkExperience(workExperience);
		if(candidato != null) {
			return new ResponseEntity<List<Candidato>>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}
	
	/*
	//OBTER POR LANGUAGES SKILLS
	@RequestMapping(value = "/candidato/languagesskill/{languagesskill}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByLanguagesSkill(@PathVariable(value = "languagesskill") int languagesskill){
		List<Candidato> candidato = candidatoService.obterPorLanguagesSkill(languagesskill);
		if(candidato != null) {
			return new ResponseEntity<List<Candidato>>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}
	
	//OBTER POR ACADEMIC QUALIFICATION
	@RequestMapping(value = "/candidato/academicQualification/{academicQualification}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByAcademicQualification(@PathVariable(value = "academicQualification") int academicQualification){
		List<Candidato> candidato = candidatoService.obterPorAcademicQualification(academicQualification);
		if(candidato != null) {
			return new ResponseEntity<List<Candidato>>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	} */
	

 
	

    
	
}