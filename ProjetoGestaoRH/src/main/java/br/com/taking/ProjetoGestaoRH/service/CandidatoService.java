package br.com.taking.ProjetoGestaoRH.service;

import java.util.List;

import br.com.taking.ProjetoGestaoRH.model.Candidato;

public interface CandidatoService {

	List<Candidato> listarTodos();
	
	Candidato obterPorId(int id);

}