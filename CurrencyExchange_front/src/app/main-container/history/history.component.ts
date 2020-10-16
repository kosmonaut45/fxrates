import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FxRates } from 'src/app/types';

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.scss']
})
export class HistoryComponent {

  public pickedCurrency: string;

  @Input() currencyCodes: string[];
  @Input() currentRateHistory: FxRates[];
  @Output() selectedCurrency = new EventEmitter();

  public onCurrencySelect(): void {
    this.selectedCurrency.emit(this.pickedCurrency);
  }
}
