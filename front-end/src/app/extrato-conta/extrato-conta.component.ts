import { Component, OnInit } from '@angular/core';
import { ExtratoContaService } from '../shared/extrato-conta-service/extrato-conta.service';
import { Extrato } from '../shared/model/extrato-model';

@Component({
  selector: 'app-extrato-conta',
  templateUrl: './extrato-conta.component.html',
  styleUrls: ['./extrato-conta.component.css']
})
export class ExtratoContaComponent implements OnInit {
  extrato: Extrato;
  constructor(private extratoContaService: ExtratoContaService) {}

  ngOnInit() {
    this.extratoContaService.get().subscribe(data => {
      this.extrato = data;
    });
  }
}
