package Currencies;

public class EUR_Euro implements Currency {

	// Estos son los metodos sobreescritos de la interfaz Currency(Moneda) 
	// y la tasa de cambio para el dólar para el día 08/05/2024 según https://www.xe.com/es/currencyconverter/convert/?Amount=1&From=CLP&To=EUR
	// 1 EUR = 1,07470 USD
		@Override
	public double currencyExchangeRate() {
		return 0.9304916;
	}
		
	@Override
	public double exchange(double mount) {
		// TODO Auto-generated method stub
		return mount/currencyExchangeRate();
	}
}
