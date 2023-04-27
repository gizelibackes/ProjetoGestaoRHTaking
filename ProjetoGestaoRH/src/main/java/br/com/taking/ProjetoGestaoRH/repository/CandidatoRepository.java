package br.com.taking.ProjetoGestaoRH.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.taking.ProjetoGestaoRH.model.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{
	
	
	//OBTER POR IDENTIFICATION DOCUMENT
	@Query("select c from Candidato c where c.identificationDocument = :identificationDocument")
	List<Candidato> findAll(String identificationDocument);
	
	//OBTER POR GENDER	
	@Query("select c from Candidato c where c.gender_id.gender_id = :gender")
	List<Candidato> findByGender(int gender);
	
	//OBTER POR INTEREST AREA - ManyToMany
	@Query("select c from Candidato c join c.areaInterest_id a where a.areaInterest_id :area_interest")
	List<Candidato> findByAreaInterest(int area_interest);
	
	/*
	 * 
	 * @Query("select c from Candidato c join c.areaInterest a where a.areaInterest_id = :areaInterest_id")
		List<Candidato> findByAreaInteresse(@Param("areaInterest_id") int areaInterest_id);
	 */
	
	/*
	//OBTER POR LOCALIDADE
	@Query("select c from Candidato c join c.city_id city join State state where c.city_id.city_id = :city and city.state_id.state_id = state.state_id")
	
	List<Candidato> findByCity(int city);
	
	
	//OBTER POR IDADE
	@Query("select c from Candidato c where c.birthdate = :birthdate")
	
	List<Candidato> findByBirthdate(Date birthdate);
	
	//OBTER POR WORK EXPERIENCE
	@Query("select c from Candidato c where c.workExperience_id.workExperience_id = :workExperience")
	
	List<Candidato> findByWorkExperience(int workExperience);
	*/
	//OBTER POR INTEREST AREA
	//@Query("select c from Candidato c join c.areaInterest_id a where a.areaInterest_id :areaInterest")
	//List<Candidato> findByAreaInterest(int areaInterest);
	
	/*
	@Query("select c from Candidato c join c.areaInterest a where a.areaInterest_id = :areaInterest_id or a.areaInterest_id = :areaInterest_id and c.gender_id.gender_id = :gender_id")
	List<Candidato> findByAreaInteresse(@Param("areaInterest_id, gender_id") int areaInterest_id, int gender_id);
	
	//OBTER POR LANGUAGES SKILLS
	@Query("select c from Candidato c where c.languagesskill_id.languagesskill_id = :languagesskill")
	
	List<Candidato> findByLanguagesSkill(int languagesskill);
	
	//OBTER POR ACADEMIC QUALIFICATION
	@Query("select c from Candidato c where c.academicQualification_id.academicQualification_id = :academicQualification")
	
	List<Candidato> findByAcademicQualification(int academicQualification);
	*/


 
}