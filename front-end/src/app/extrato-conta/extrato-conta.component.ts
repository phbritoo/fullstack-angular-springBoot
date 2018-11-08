import { Component, OnInit } from '@angular/core';
import { ExtratoContaService } from '../shared/extrato-conta-service/extrato-conta.service';
import { ListaControleLancamento } from '../lancamentos-list/lancamentos-list.component';

@Component({
  selector: 'app-extrato-conta',
  templateUrl: './extrato-conta.component.html',
  styleUrls: ['./extrato-conta.component.css'],
})
export class ExtratoContaComponent implements OnInit {

  extrato: any;
  listaControleLancamento: ListaControleLancamento[];
  constructor(private extratoContaService: ExtratoContaService) { }

  ngOnInit() {
    this.extratoContaService.get().subscribe(data => {
      this.extrato = data;
      this.listaControleLancamento = this.extrato.listaControleLancamento.map(lancamento => {
        return {
          codigoIdentificadorUnico: parseInt(lancamento.codigoIdentificadorUnico, 10),
          nomeBanco: lancamento.nomeBanco,
          dataEfetivaLancamento: lancamento.dataEfetivaLancamento,
          valorLancamentoRemessa: lancamento.valorLancamentoRemessa,
          descricaoGrupoPagamento: lancamento.descricaoGrupoPagamento,
          quantidadeLancamentoRemessa: lancamento.quantidadeLancamentoRemessa,
          numeroEvento: lancamento.numeroEvento,
          dataLancamentoContaCorrenteCliente: lancamento.dataLancamentoContaCorrenteCliente,
          lancamentoContaCorrenteCliente: {
            nomeSituacaoRemessa: lancamento.lancamentoContaCorrenteCliente.nomeSituacaoRemessa,
            nomeTipoOperacao: lancamento.lancamentoContaCorrenteCliente.nomeTipoOperacao,
            numeroRemessaBanco: lancamento.lancamentoContaCorrenteCliente.numeroRemessaBanco,
            dadosDomicilioBancario: {
              codigoBanco: lancamento.lancamentoContaCorrenteCliente.dadosDomicilioBancario.codigoBanco,
              numeroAgencia: lancamento.lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroAgencia,
              numeroContaCorrente: lancamento.lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroContaCorrente,
            },
          },
          dadosBancarios: `${lancamento.nomeBanco} Ag ${lancamento.lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroAgencia} CC ${lancamento.lancamentoContaCorrenteCliente.dadosDomicilioBancario.numeroContaCorrente}`
        };
      });
    });

  }

}
