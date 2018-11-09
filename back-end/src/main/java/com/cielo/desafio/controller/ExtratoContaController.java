package com.cielo.desafio.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cielo.desafio.facade.ExtratoInterface;
import com.cielo.desafio.model.objeto.ExtratoObject;

@RestController
@RequestMapping("/api/extratoContaCorrente")
public class ExtratoContaController {

	@Autowired
	private ExtratoInterface extratoInterface;
	
    public ExtratoContaController() {
    }

    @RequestMapping(method= RequestMethod.GET)
    public ExtratoObject extrato() {
    	return extratoInterface.get();
    }
    
}