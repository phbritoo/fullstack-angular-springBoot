package com.cielo.desafio.model.convert;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cielo.desafio.model.ListaLancamento;
import com.cielo.desafio.model.entity.Extrato;
import com.cielo.desafio.model.objeto.ExtratoObject;

@Component
public class ExtratoConvert {

	@Autowired
	private LancamentoConvert lancamentoDao;
	public ExtratoObject toExtratoObject(Extrato extrato) {
		ExtratoObject extratoObject = new ExtratoObject();
		extratoObject.setLancamentos(new ArrayList<>());
		for(ListaLancamento lancamento: extrato.getListaControleLancamento()) {
			extratoObject.getLancamentos().add(lancamentoDao.toLancamentoObject(lancamento));
		}
		return extratoObject;
	}

}
