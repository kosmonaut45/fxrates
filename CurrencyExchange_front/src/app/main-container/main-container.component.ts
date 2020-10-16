import { Component, OnInit } from '@angular/core';
import { FxcalcService } from 'src/app/services/fxcalc.service';
import { FxCurrency, FxExchanged, FxRates } from '../types';

@Component({
  selector: 'app-main-container',
  templateUrl: './main-container.component.html',
  styleUrls: ['./main-container.component.scss']
})
export class MainContainerComponent implements OnInit {

  public rates: FxRates[] = [];
  public history: FxRates[] = [];
  public currencies: string[] = [];
  public calculatedRate: FxExchanged = { rate: '', value: '' };

  constructor(private fxCalcService: FxcalcService) { }

  ngOnInit(): void {
    this.fxCalcService.fetchFxRates().subscribe(data => {
      this.rates = data;
    });
    this.fxCalcService.fetchCurrencies().subscribe(data => {
      this.currencies = data.map((currency) => currency.currencyCode);
    });
  }

  fetchHistoryByCurrency($event): void {
    this.fxCalcService.fetchFxRatesHistory($event).subscribe(data => {
      this.history = data;
    });
  }

  fetchCalculatedRate($event): void {
    this.fxCalcService.fetchCalculatedRates($event.currency, $event.amount).subscribe(data => {
      this.calculatedRate = data;
    });
  }
}


