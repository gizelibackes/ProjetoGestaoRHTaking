package br.com.taking.ProjetoGestaoRH.service;

import java.sql.Date;
import java.util.List;

import br.com.taking.ProjetoGestaoRH.model.Candidato;


public interface CandidatoService {

	List<Candidato> listarTodos();
	
	Candidato obterPorId(int id);
	
	
	//ATRIBUTOS NATIVOS DA CLASSE CANDIDATO
	List<Candidato> findByIdentificationDocument(String identification);
	//List<Candidato> obterPorBirthdate(Date birthdate);
	
	
	//ATRIBUTOS COM RELACIONAMENTO @ManyToOne COM A CLASSE CANDIDATO
	List<Candidato> obterPorGender(int gender);
	
	//ATRIBUTOS COM RELACIONAMENTO @ManyToMany COM A CLASSE CANDIDATO
	List<Candidato> obterPorAreaInterest(int area_interest);
	//List<Candidato> obterPorAreaInterest(int areaInterest);
	//List<Candidato> findByAreaInteresse(int areaInterest_id);
	

	
	//List<Candidato> obterPorWorkExperience(int workExperience);
	

	
	//List<Candidato> obterPorLanguagesSkill(int languagesskill);
	
	//List<Candidato> obterPorAcademicQualification(int academicQualification);
	
	//List<Candidato> obterPorCity(int city);
	 

}