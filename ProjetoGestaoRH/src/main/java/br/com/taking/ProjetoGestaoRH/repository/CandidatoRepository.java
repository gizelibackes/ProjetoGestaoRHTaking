package br.com.taking.ProjetoGestaoRH.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.taking.ProjetoGestaoRH.model.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{
	
	
	//FILTRO CANDIDATO
	   @Query("SELECT c "
			+ "FROM Candidato c "
			+ "JOIN c.areaInterest_id ai "
			+ "JOIN c.academicQualification_id ac "
			+ "JOIN c.workExperience_id we "
			+ "JOIN c.languagesskill_id ls "
			+ "JOIN c.city_id city "
			+ "JOIN city.state_id state "
			+ "WHERE c.identificationDocument = :identificationDocument "
			+ "OR  c.gender_id.gender_id = :gender "
			+ "OR  c.areaInterest_id.areaInterest_id = ai.areaInterest_id"
			+ "AND ai.areaInterest_id = :area_interest "
			+ "OR  ai.areaInterest_id.areaInterest_id like :areaInterestname "
			+ "OR  c.workExperience_id.workExperience_id = we.workExperience_id "
			+ "AND we.role_id.role_id = :role "
			+ "OR  c.academicQualification_id.academicQualification_id = ac.academicQualification_id "
			+ "AND ac.academicQualification_id.formation_id = :formation "
			+ "AND ac.academicQualification_id.status_id = :status "
			+ "OR  ac.academicQualification_id.institution_id = :institution "
			+ "OR  ac.academicQualification_id.course_id = :course "
			+ "OR  ac.academicQualification_id.courseName like :coursename "
			+ "OR  ac.academicQualification_id.institutionName like :institutionname "
			+ "OR  c.city_id.city_id = city.city_id "
			+ "AND city.city_id = :city "
			+ "OR  c.city_id.city_id = city.city_id "
			+ "AND city.city_id = state.city_id "
			+ "AND state.state_id = :state "
			+ "OR  c.city_id.city_id = city.city_id "
			+ "AND city.city_id = state.city_id "
			+ "AND state.state_id = country.state_id "
			+ "AND country.country_id = := country "
			+ "OR  c.languagesskill_id.languagesskill_id = ls.languagesskill_id "
			+ "AND ls.languagesskill_id.language_id = :languages "
			+ "AND ls.languagesskill_id.level_id = :level "
			+ "OR  DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') = :age "
			+ "OR  DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') >= :ageini "
			+ "AND DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') <= :agefim ")
	
	List<Candidato> findByCandidato(String identificationDocument, int gender,int area_interest, String areaInterestname, int role, int formation, int status,int institution, int course, String coursename, String institutionname,int city, int state, int country, int languages, int level, Date age, Date ageini,Date agefim);
	
	

 
}