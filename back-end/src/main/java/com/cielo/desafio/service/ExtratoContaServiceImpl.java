package com.cielo.desafio.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.cielo.desafio.assembler.ExtratoContaAssembler;
import com.cielo.desafio.model.entity.Extrato;
import com.cielo.desafio.object.ExtratoContaObject;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ExtratoContaServiceImpl implements ExtratoContaService {
	
	@Autowired
	private ExtratoContaAssembler extratoContaAssembler;
	//Mapea o json que veio do controlador
	@Override
	public ExtratoContaObject get() {
		ObjectMapper mapper = new ObjectMapper();
    	ExtratoContaObject extratoContaObject = new ExtratoContaObject();
		try {
			Extrato extrato = new Extrato();
			File file =new ClassPathResource(
				      "lancamento-conta-legado.json").getFile();
			extrato = mapper.readValue(file, Extrato.class);
			extratoContaObject = extratoContaAssembler.toExtratoContaObject(extrato);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        return extratoContaObject;
	}

}
