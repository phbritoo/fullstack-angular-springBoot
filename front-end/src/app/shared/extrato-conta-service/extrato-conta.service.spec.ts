import { TestBed } from '@angular/core/testing';

import { ExtratoContaService } from './extrato-conta.service';
import { HttpClientModule } from '@angular/common/http';

describe('ExtratoContaService', () => {
  beforeEach(() =>
    TestBed.configureTestingModule({
      imports: [HttpClientModule]
    }));

  it('should be created', () => {
    const service: ExtratoContaService = TestBed.get(ExtratoContaService);
    expect(service).toBeTruthy();
  });
});
