import {Component, OnInit, Input, ViewChild} from '@angular/core';
import {Lancamento} from '../shared/model/lancamento-model';
import {MatPaginator, MatTableDataSource, MatSort} from '@angular/material';
import {merge, Observable, of as observableOf} from 'rxjs';
import {catchError, map, startWith, switchMap, delay} from 'rxjs/operators';

@Component({selector: 'app-lancamentos-list',
 templateUrl: './lancamentos-list.component.html',
 styleUrls: ['./lancamentos-list.component.css']})
export class LancamentosListComponent implements OnInit {
  @Input()
  lancamentos: Lancamento[];
  isLoadingResults = true;

  dataSource = new MatTableDataSource < Lancamento > ();
  @ViewChild(MatPaginator)paginator: MatPaginator;
  @ViewChild(MatSort)sort: MatSort;

  displayedColumns: string[] = [
    'dataLancamento',
    'descricao',
    'numero',
    'situacao',
    'dataConfirmacao',
    'dadosBancarios',
    'valorFinal'
  ];
  constructor() {}

  ngOnInit() {
    this.dataSource.data = this.lancamentos;

  }
}
