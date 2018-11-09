package com.cielo.desafio.model.objeto;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ExtratoObject {
	public List<LancamentoObject> lancamentos;

	public List<LancamentoObject> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<LancamentoObject> lancamentos) {
		this.lancamentos = lancamentos;
	}
}
