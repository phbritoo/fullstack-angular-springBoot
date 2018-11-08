import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { LancamentosListComponent } from './lancamentos-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from '../shared/material/material.module';
import { HttpClientModule } from '@angular/common/http';

describe('LancamentosListComponent', () => {
  let component: LancamentosListComponent;
  let fixture: ComponentFixture<LancamentosListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [LancamentosListComponent],
      imports: [
        HttpClientModule,
        RouterTestingModule,
        BrowserAnimationsModule,
        MaterialModule
      ]
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LancamentosListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
