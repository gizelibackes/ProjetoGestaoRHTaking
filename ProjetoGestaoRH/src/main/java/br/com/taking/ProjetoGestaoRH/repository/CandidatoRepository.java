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
			+ "JOIN area_interest aint"
			+ "JOIN c.academicQualification_id ac "
			+ "JOIN course co "
			+ "JOIN institution in "
			+ "JOIN c.workExperience_id we "
			+ "JOIN c.languagesskill_id ls "
			+ "JOIN c.city_id city "
			+ "JOIN city.state_id state "
			+ "JOIN state.country_id "
			+ "WHERE "
			
			 //buca por documento de identificacao 
			+ "(c.identificationDocument = :identificationDocument) "
			
			// busca por genero
			+ "OR (c.gender_id.gender_id = :gender) "    
			
			// busca por area de interesse     
			+ "OR (c.areaInterest_id.areaInterest_id = :area_interest) "	
			
			// busca por palavra chave area de interesse
			+ "OR  (c.areaInterest_id.areaInterest_id = ai.areaInterest_id " 
			+ "AND ai.areaInterest_id. = aint.areaInterest_id "
			+ "AND aint.areaName like :areaInterestname) "
			
			// busca por papel desempenhado
			+ "OR  (c.workExperience_id.workExperience_id = we.workExperience_id "
			+ "AND (we.role_id.role_id = :role) "
			
			// busca por palavra chave nome da compania 
			+ "OR  (we.workExperience_id.companyName like :companyName) "
			
			// busca por palavra chave de atividade realizadas
			+ "OR  (we.workExperience_id.companyName like :activitiesPerformed)) "
			
			// busca por formacao e status
			+ "OR (c.academicQualification_id.academicQualification_id = ac.academicQualification_id "
			+ "AND (ac.academicQualification_id.formation_id = :formation "
			+ "AND ac.academicQualification_id.status_id = :status) "
			
			// busca por intituicao
			+ "OR  (ac.academicQualification_id.institution_id = :institution) "
			
			// busca por curso
			+ "OR  (ac.academicQualification_id.course_id = :course) "
			
			// busca por palavra chave nome do curso
			+ "OR  (ac.academicQualification_id.course_id = co.course_id "
			+ "AND co.courseName like :coursename) "
			
			// busca por palavra chave nome da instituicao de ensino
			+ "OR  (ac.academicQualification_id.institution_id =  in.institution_id "
			+ "AND in.institutionName like :institutionname)) "
			
			// busca por cidade
			+ "OR  (c.city_id.city_id = city.city_id "
			+ "AND (city.city_id = :city) "
			
			// busca por cidade estado
			+ "OR (city.city_id = state.city_id "
			+ "AND state.state_id = :state) "
			
			// busca por pais
			+ "OR  (city.city_id = state.city_id "
			+ "AND state.state_id = country.state_id "
			+ "AND country.country_id = :country)) "
			
			// busca por idioma e nivel de proficiencia 
			+ "OR  (c.languagesskill_id.languagesskill_id = ls.languagesskill_id "
			+ "AND (ls.languagesskill_id.language_id = :languages "
			+ "AND ls.languagesskill_id.level_id = :level) "
			
			// busca por idioma
			+ "OR (ls.languagesskill_id.language_id = :languages)) "
			
			// busca por idade
			+ "OR  (DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') = :age) "
			
			// busca por range de idade
			+ "OR  (DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') >= :ageini "
			+ "AND DATE_FORMAT(CURDATE(), '%Y') - DATE_FORMAT(c.birthdate, '%Y') <= :agefim) ")  
	
	List<Candidato> findByCandidato(String identificationDocument, int gender,int area_interest, String areaInterestname, int role, String companyName, String activitiesPerformed, int formation, int status,int institution, int course, String coursename, String institutionname, int city, int state, int country, int languages, int level, int age, Date ageini, Date agefim);
	                                  //   identificationDocument, 0         ,0                 ,null                     ,0        ,0            ,0         ,0               ,0          ,null               ,null                  ,0        ,0         ,0           ,0             ,0          ,0       ,null       ,null
	

 
}