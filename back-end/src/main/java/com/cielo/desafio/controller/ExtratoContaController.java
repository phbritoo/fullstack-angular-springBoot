package com.cielo.desafio.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cielo.desafio.object.ExtratoContaObject;
import com.cielo.desafio.service.ExtratoContaService;

// Controlador aonde se chama o arquivo json
@RestController 
@RequestMapping("/api/extratoContaCorrente")
public class ExtratoContaController {

	@Autowired
	private ExtratoContaService extratoContaService;
	
    public ExtratoContaController() {
    }

    @RequestMapping(method= RequestMethod.GET)
    public ExtratoContaObject extrato() {
        return extratoContaService.get();
    }

}
