import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { FxCurrency, FxExchanged, FxRates } from '../types';

@Injectable({
  providedIn: 'root'
})
export class FxcalcService {

  constructor(private httpClient: HttpClient) {}

  private baseUrl = 'http://localhost:8080/api/v1/fx';
  private ratesUrl = '/rates';
  private currenciesUrl = '/currencies';

  public fetchFxRates(): Observable<FxRates[]> {
    return this.httpClient.get<FxRates[]>(this.baseUrl + this.ratesUrl);
  }

  public fetchCurrencies(): Observable<FxCurrency[]> {
    return this.httpClient.get<FxCurrency[]>(this.baseUrl + this.currenciesUrl);
  }

  public fetchFxRatesHistory(currency: string): Observable<FxRates[]> {
    return this.httpClient.get<FxRates[]>(`${this.baseUrl}${this.ratesUrl}/${currency}`);
  }

  public fetchCalculatedRates(currencyCode: string, amount: number): Observable<FxExchanged> {
    return this.httpClient.get<FxExchanged>(`${this.baseUrl}${this.ratesUrl}/${currencyCode}/exchange?amount=${amount}`);
  }
}
