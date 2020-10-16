export interface FxRates {
  currency: string;
  date: string;
  exchangeCurrency: string;
  exchangeValue: number;
}

export interface FxCurrency {
  currencyCode: string;
  currencyName: string;
}

export interface FxExchanged {
  rate: string;
  value: string;
}