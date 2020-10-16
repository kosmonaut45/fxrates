import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FxRates } from 'src/app/types';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.scss']
})
export class CalculatorComponent {

  public pickedCurrency: string;
  public amount: string;

  @Input() currencyCodes: string[];
  @Input() calculatedRate;
  @Output() calculate = new EventEmitter();

  public calculateRate(): void {
    console.log(this.pickedCurrency, this.amount)
    this.calculate.emit({ currency: this.pickedCurrency, amount: this.amount });
  }
}
