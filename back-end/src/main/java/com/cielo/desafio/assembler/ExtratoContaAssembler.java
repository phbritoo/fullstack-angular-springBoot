package com.cielo.desafio.assembler;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cielo.desafio.model.ListaControleLancamento;
import com.cielo.desafio.model.entity.Extrato;
import com.cielo.desafio.object.ExtratoContaObject;
@Component
public class ExtratoContaAssembler {
	
	@Autowired
	private LancamentoContaAssembler lancamentoContaAssembler;
	
	public ExtratoContaObject toExtratoContaObject(Extrato extrato) {
		ExtratoContaObject extratoContaObject = new ExtratoContaObject();
		extratoContaObject.setLancamentos(new ArrayList<>());
		for(ListaControleLancamento lancamento: extrato.getListaControleLancamento()) {
			extratoContaObject.getLancamentos().add(lancamentoContaAssembler.toLancamentoContaObject(lancamento));
		}
		return extratoContaObject;
	}

}
