package com.cielo.desafio.object;

import java.util.List;

public class ExtratoContaObject {
	
	public List<LancamentoContaObject> lancamentos;

	public List<LancamentoContaObject> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<LancamentoContaObject> lancamentos) {
		this.lancamentos = lancamentos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lancamentos == null) ? 0 : lancamentos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExtratoContaObject other = (ExtratoContaObject) obj;
		if (lancamentos == null) {
			if (other.lancamentos != null)
				return false;
		} else if (!lancamentos.equals(other.lancamentos))
			return false;
		return true;
	}	
	
	
	
	

}
