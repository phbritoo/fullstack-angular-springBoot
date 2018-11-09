package com.cielo.desafio.model.convert;

import org.springframework.stereotype.Component;

import com.cielo.desafio.model.LancamentoConta;
import com.cielo.desafio.model.ListaLancamento;
import com.cielo.desafio.model.objeto.LancamentoObject;
@Component
public class LancamentoConvert {

	public LancamentoObject toLancamentoObject(ListaLancamento lancamento) {
		LancamentoObject lancamentoObject = new LancamentoObject();
		
		LancamentoConta lancamentoConta = lancamento.getLancamentoConta();
		lancamentoObject.setSituacao(lancamentoConta.getNomeSituacaoRemessa());
		lancamentoObject.setDescricao(lancamentoConta.getNomeTipoOperacao());
		lancamentoObject.setNumero(lancamentoConta.getNumeroRemessaBanco());
		lancamentoObject.setDataConfirmacao(lancamento.getDataLancamentoContaCorrenteCliente());
		lancamentoObject.setDataLancamento(lancamento.getDataEfetivaLancamento());
		lancamentoObject.setValorFinal(lancamento.getValorLancamentoRemessa());
		
		//construtor para botar o nome do banco +  agencia + conta
		StringBuilder dadosBancarios = new StringBuilder();
		dadosBancarios.append(lancamento.getNomeBanco());
		dadosBancarios.append("  Ag ").append(lancamentoConta.getDataBank().getNumeroAgencia());
		dadosBancarios.append("  CC ").append(lancamentoConta.getDataBank().getNumeroContaCorrente());
		lancamentoObject.setDataBank(dadosBancarios.toString());
		
		return lancamentoObject;
	}
	
	

}
