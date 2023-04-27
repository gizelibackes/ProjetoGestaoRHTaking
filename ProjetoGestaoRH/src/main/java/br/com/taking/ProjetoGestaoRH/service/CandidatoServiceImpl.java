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
	
	//OBTER POR IDENTIFICATION DOCUMENT
	@Override
	public List<Candidato> findByIdentificationDocument(String identification) {
	if(identification != null) {
		return candidatoRepository.findAll(identification);
		}else {
			return null;
		}
	}
	
	//OBTER POR GENDER
	@Override
	public List<Candidato> obterPorGender(int gender) {
		
		return candidatoRepository.findByGender(gender);
		
		/* Optional<Candidato> result = candidatoRepository.findByGender(gender);
		if(result.isPresent()) {
			return result.get();
			}else {
				return null;
			} */

	}
	
	//OBTER POR INTEREST AREA
	@Override
	public List<Candidato> obterPorAreaInterest(int area_interest) {
		
		return candidatoRepository.findByAreaInterest(area_interest);

	}
	/*
	 * 
	 * @Override
	    public List<Candidato> findByAreaInteresse(int areaInterest_id) {
	        return candidatoRepository.findByAreaInteresse(areaInterest_id);
	    }
	 * 
	 * 
	 * 
	 
	//OBTER POR LOCALIDADE
	@Override
	public List<Candidato> obterPorCity(int city) {
		
		return candidatoRepository.findByCity(city);

	}
	
	/*
	//OBTER POR IDADE
	@Override
	public List<Candidato> obterPorBirthdate(Date birthdate) {
		
		return candidatoRepository.findByBirthdate(birthdate);

	}
	
	//OBTER POR WORK EXPERIENCE
	@Override
	public List<Candidato> obterPorWorkExperience(int workExperience) {
		
		return candidatoRepository.findByWorkExperience(workExperience);

	}
	*/

	/*
	//OBTER POR LANGUAGES SKILLS
	@Override
	public List<Candidato> obterPorLanguagesSkill(int languagesskill) {
		
		return candidatoRepository.findByLanguagesSkill(languagesskill);

	}
	/*
	//OBTER POR ACADEMIC QUALIFICATION
	@Override
	public List<Candidato> obterPorAcademicQualification(int academicQualification) {
		
		return candidatoRepository.findByAcademicQualification(academicQualification);

	} */
	

	
	

}
