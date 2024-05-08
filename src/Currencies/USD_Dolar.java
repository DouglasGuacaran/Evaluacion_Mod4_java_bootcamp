package Currencies;

public class USD_Dolar implements Currency{
	
	// métodos implementados desde la interfaz Currency
	// quise tomar como moneda base el dólar estadounidense

	@Override
	public double currencyExchangeRate() {
		return 1;
	}
	
	@Override
	public double exchange(double mount) {
		return mount/currencyExchangeRate();
	}
	
}
