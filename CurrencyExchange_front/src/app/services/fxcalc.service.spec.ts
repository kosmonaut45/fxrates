import { TestBed } from '@angular/core/testing';

import { FxcalcService } from './fxcalc.service';

describe('FxcalcService', () => {
  let service: FxcalcService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FxcalcService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
