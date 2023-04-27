package br.com.taking.ProjetoGestaoRH.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.ProjetoGestaoRH.model.Candidato;
import br.com.taking.ProjetoGestaoRH.repository.CandidatoRepository;




@Service
public class CandidatoServiceImpl implements CandidatoService{

	
	@Autowired
	CandidatoRepository candidatoRepository;
	

	@Override
	public List<Candidato> listarTodos() {
	
		return candidatoRepository.findAll();
	}
	
	@Override
	public Candidato obterPorId(int id) {
		
		Optional<Candidato> result = candidatoRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
			}else {
				return null;
			}
	}
	
	//OBTER CANDIDATO
	@Override
	public List<Candidato> ObterCandidato(String identificationDocument, int gender, int area_interest, String areaInterestname, int role, int formation, int institution, int course, String coursename, String institutionname, int status, int city, int state, int country, int languages, int level, Date age, Date ageini, Date agefim) {
		
		
		return candidatoRepository.findByCandidato(identificationDocument, gender, area_interest, areaInterestname, role, formation, status, institution, course, coursename, institutionname, city, state, country, languages, level, age, ageini, agefim);
	}
	
}



	
	
