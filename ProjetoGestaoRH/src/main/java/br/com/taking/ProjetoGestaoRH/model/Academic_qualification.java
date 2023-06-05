package br.com.taking.ProjetoGestaoRH.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="academic_qualification")
public class Academic_qualification {
	
	@Id
	@Column (name= "academicQualification_id")
	private int academicQualification_id;
		
	@Column(name = "startMonth")
	private Date startMonth;
	
	@Column(name = "startYear")
	private Date startYear;
	
	@Column(name = "endMonth")
	private Date endMonth;
	
	@Column(name = "endYear")
	private Date endYear;
	
	@Column(name = "candidato_id")
	private int candidato_id;
	
	@ManyToOne
	@JoinColumn(name= "formation_id")
	private Formation formation_id;
	
	@ManyToOne
	@JoinColumn(name= "institution_id")
	private Institution institution_id;
	
	@ManyToOne
	@JoinColumn(name= "course_id")
	private Course course_id;
	
	@ManyToOne
	@JoinColumn(name= "status_id")
	private Status status_id;

	public int getAcademicQualification_id() {
		return academicQualification_id;
	}

	public void setAcademicQualification_id(int academicQualification_id) {
		this.academicQualification_id = academicQualification_id;
	}

	public Date getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(Date startMonth) {
		this.startMonth = startMonth;
	}

	public Date getStartYear() {
		return startYear;
	}

	public void setStartYear(Date startYear) {
		this.startYear = startYear;
	}

	public Date getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(Date endMonth) {
		this.endMonth = endMonth;
	}

	public Date getEndYear() {
		return endYear;
	}

	public void setEndYear(Date endYear) {
		this.endYear = endYear;
	}

	public int getCandidato_id() {
		return candidato_id;
	}

	public void setCandidato_id(int candidato_id) {
		this.candidato_id = candidato_id;
	}

	public Formation getFormation_id() {
		return formation_id;
	}

	public void setFormation_id(Formation formation_id) {
		this.formation_id = formation_id;
	}

	public Institution getInstitution_id() {
		return institution_id;
	}

	public void setInstitution_id(Institution institution_id) {
		this.institution_id = institution_id;
	}

	public Course getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Course course_id) {
		this.course_id = course_id;
	}

	public Status getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Status status_id) {
		this.status_id = status_id;
	}


	


}