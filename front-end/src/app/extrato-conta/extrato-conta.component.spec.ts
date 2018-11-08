import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExtratoContaComponent } from './extrato-conta.component';
import { LancamentosListComponent } from '../lancamentos-list/lancamentos-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from '../shared/material/material.module';
import { HttpClientModule } from '@angular/common/http';

describe('ExtratoContaComponent', () => {
  let component: ExtratoContaComponent;
  let fixture: ComponentFixture<ExtratoContaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [BrowserAnimationsModule, MaterialModule, HttpClientModule],
      declarations: [ExtratoContaComponent, LancamentosListComponent]
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExtratoContaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
