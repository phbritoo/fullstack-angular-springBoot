package com.cielo.desafio.model.objeto;

import org.springframework.stereotype.Component;

@Component
public class LancamentoObject {
	public String dataLancamento;
	public String descricao;
	public Long numero;
	public String situacao;
	public String dataConfirmacao;
	public String dataBank;
	public Double valorFinal;
	private Long quantidadeLancamentos;
	private Double valorLancamentos;
	
	public Long getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public Double getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getDataConfirmacao() {
		return dataConfirmacao;
	}
	public void setDataConfirmacao(String dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}
	public String getDataBank() {
		return dataBank;
	}
	public void setDataBank(String dataBank) {
		this.dataBank = dataBank;
	}
	public Double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

	
}
