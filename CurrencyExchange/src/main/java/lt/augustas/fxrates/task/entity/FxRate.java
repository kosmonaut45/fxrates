package lt.augustas.fxrates.task.entity;

import java.math.BigDecimal;

public class FxRate {
		String currency;
		String date;
		String exchangeCurrency;
		BigDecimal exchangeValue;

		public FxRate() {}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getExchangeCurrency() {
			return exchangeCurrency;
		}

		public void setExchangeCurrency(String exchangeCurrency) {
			this.exchangeCurrency = exchangeCurrency;
		}

		public BigDecimal getExchangeValue() {
			return exchangeValue;
		}

		public void setExchangeValue(BigDecimal exchangeValue) {
			this.exchangeValue = exchangeValue;
		}

		@Override
		public String toString() {
			return "FxRate{" +
					"currency='" + currency + '\'' +
					", date='" + date + '\'' +
					", counterCurrency='" + exchangeCurrency + '\'' +
					", counterValue='" + exchangeValue + '\'' +
					'}';
		}
	}