package com.cielo.desafio.assembler;
import org.springframework.stereotype.Component;

import com.cielo.desafio.model.DadosBancarios;
import com.cielo.desafio.model.LancamentoConta;
import com.cielo.desafio.model.ListaControleLancamento;
import com.cielo.desafio.object.LancamentoContaObject;

@Component
public class LancamentoContaAssembler {

	public LancamentoContaObject toLancamentoContaObject(ListaControleLancamento lancamento) {
		
		//instanciando a classe LancamentoContaObject e chamando os seus atributos
		LancamentoContaObject lancamentoContaObject = new LancamentoContaObject();
		LancamentoConta lancamentoContaCorrenteCliente = lancamento.getLancamentoContaCorrenteCliente();
		DadosBancarios dadosBancarios = lancamentoContaCorrenteCliente.getDadosDomicilioBancario();
		lancamentoContaObject.setSituacao(lancamentoContaCorrenteCliente.getNomeSituacaoRemessa());
		lancamentoContaObject.setDescricao(lancamentoContaCorrenteCliente.getNomeTipoOperacao());
		lancamentoContaObject.setNumero(lancamentoContaCorrenteCliente.getNumeroRemessaBanco());
		lancamentoContaObject.setDataConfirmacao(lancamento.getDataLancamentoContaCorrenteCliente());
		lancamentoContaObject.setDataLancamento(lancamento.getDataEfetivaLancamento());
		lancamentoContaObject.setValorFinal(lancamento.getValorLancamentoRemessa());
		
		////instanciando a classe dadoBancarios1 e chamando os seus atributos
		StringBuilder dadosBancarios1 = new StringBuilder();
		dadosBancarios1.append(lancamento.getNomeBanco());
		dadosBancarios1.append("  Ag ").append(dadosBancarios.getNumeroAgencia());
		dadosBancarios1.append("  CC ").append(dadosBancarios.getNumeroContaCorrente());
		lancamentoContaObject.setDadosBancarios(dadosBancarios.toString());
		return lancamentoContaObject;
	}
}
