import { Lancamento } from './lancamento-model';

export interface Extrato {
  lancamentos: Array<Lancamento>;
}
