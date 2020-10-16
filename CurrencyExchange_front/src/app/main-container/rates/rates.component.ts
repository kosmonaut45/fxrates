import { Component, Input, OnInit } from '@angular/core';
import { FxRates } from 'src/app/types';

@Component({
  selector: 'app-rates',
  templateUrl: './rates.component.html'
})
export class RatesComponent {
  @Input() currentRates: FxRates[];
}
