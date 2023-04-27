package br.com.taking.ProjetoGestaoRH.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.ProjetoGestaoRH.model.Candidato;
import br.com.taking.ProjetoGestaoRH.service.CandidatoService;

@RestController
public class CandidatoController {
	
	@Autowired
	CandidatoService candidatoService;
	
	@RequestMapping(value= "/candidato", method = RequestMethod.GET)

	public ResponseEntity<List<Candidato>> GetALL(){
		
		List<Candidato> resultado = candidatoService.listarTodos();

		return new ResponseEntity<List<Candidato>> (resultado, HttpStatus.OK);
		
	}
	
	//OBTER POR ID
	@RequestMapping(value = "/candidato/{id}", method = RequestMethod.GET)
	public ResponseEntity<Candidato> GetById(@PathVariable(value ="id") int id){
		 Candidato candidato = candidatoService.obterPorId(id);
		 if(candidato != null) {
			 return new ResponseEntity<Candidato>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	}
	
	
	//OBTER POR CANDIDATO
	@RequestMapping(value = "/candidato/identificationdocument/{identificationDocument}", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findByCandidato(@PathVariable(value = "identificationDocument") String identificationDocument){
		List<Candidato> candidato = candidatoService.ObterCandidato(identificationDocument, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		 if(candidato != null) {
			 return new ResponseEntity<>(candidato, HttpStatus.OK );
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		 }
	} 	

    
	
}