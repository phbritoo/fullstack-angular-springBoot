package com.cielo.desafio.facade;
import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cielo.desafio.model.convert.ExtratoConvert;
import com.cielo.desafio.model.entity.Extrato;
import com.cielo.desafio.model.objeto.ExtratoObject;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
@Component
public class ExtratoBean implements ExtratoInterface{
	@Autowired
	private ExtratoConvert extratoDao;

	@Override
	public ExtratoObject get() {
		ObjectMapper mapper = new ObjectMapper();
    	ExtratoObject extratoObject = new ExtratoObject();
		try {
			Extrato extrato = new Extrato();
			File file =new ClassPathResource("lancamento-conta-legado.json").getFile();
			extrato = mapper.readValue(file, Extrato.class);
			extratoObject = extratoDao.toExtratoObject(extrato);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        return extratoObject;
	}

	
	
}
