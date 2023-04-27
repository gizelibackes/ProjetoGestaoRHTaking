package br.com.taking.ProjetoGestaoRH.service;

import java.sql.Date;
import java.util.List;

import br.com.taking.ProjetoGestaoRH.model.Candidato;


public interface CandidatoService {

	List<Candidato> listarTodos();
	
	Candidato obterPorId(int id);

	List<Candidato> ObterCandidato(String identificationDocument, int gender, int area_interest,
			String areaInterestname, int role, int formation, int institution, int course, String coursename,
			String institutionname, int status, int city, int state, int country, int languages, int level, Date age,
			Date ageini, Date agefim);
		 

}