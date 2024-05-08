package Currencies;

public class CLP_Chilean_Peso implements Currency{
	
	//Factor de conversion del peso Chileno, 
	// la tasa de cambio para el dólar para el día 08/05/2024 según https://www.xe.com/es/currencyconverter/convert/?Amount=1&From=CLP&To=USD
	// 1 USD = 936,691 CLP
	
	@Override
	public double currencyExchangeRate() {
		return 936.691;
	}

	@Override
	public double exchange(double mount) {
		return mount;
	}
	

}
