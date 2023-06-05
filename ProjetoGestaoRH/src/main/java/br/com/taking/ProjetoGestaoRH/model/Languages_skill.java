package br.com.taking.ProjetoGestaoRH.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="languages_skill")
public class Languages_skill {
	
	@Id
	@Column (name= "languagesskill_id ")
	private int languagesskill_id;
	
	//@Id
	@Column (name= "candidato_id ")
	private int candidato_id;
		
	@ManyToOne
	@JoinColumn(name= "language_id")
	private Languages language_id;
	
	@ManyToOne
	@JoinColumn(name= "level_id")
	private Level level_id;

	public int getLanguagesskill_id() {
		return languagesskill_id;
	}

	public void setLanguagesskill_id(int languagesskill_id) {
		this.languagesskill_id = languagesskill_id;
	}

	public int getCandidato_id() {
		return candidato_id;
	}

	public void setCandidato_id(int candidato_id) {
		this.candidato_id = candidato_id;
	}

	public Languages getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Languages language_id) {
		this.language_id = language_id;
	}

	public Level getLevel_id() {
		return level_id;
	}

	public void setLevel_id(Level level_id) {
		this.level_id = level_id;
	}




}
