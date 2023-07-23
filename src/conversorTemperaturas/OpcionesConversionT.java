package conversorTemperaturas;

import javax.swing.JOptionPane;

public class OpcionesConversionT {
	
	 
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura (double valor) {
	
	String opcion = JOptionPane.showInputDialog(null, "Elije la Temperatura que quieras Convertir ", "Temperaturas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{"Celsius a Fahrenheit", "Celsius a Kelvin", "Celsius a Rankine", "Fahrenheit a Celsius", 
					"Fahrenheit a Kelvin", "Fahrenheit a Rankine", "Kelvin a Celsius", "Kelvin a Fahrenheit", "Kelvin a Rankine", 
					"Rankine a Celsius", "Rankine a Fahrenheit", "Rankine a Kelvin"},"Seleccion").toString();
	
	
	
	switch(opcion){
	case "Celsius a Fahrenheit":
		temperatura.ConvertirCelsiusAFahrenheit(valor);
		break;
	
	case "Celsius a Kelvin":
		temperatura.ConvertirCelsiusAKelvin(valor);
		break;
	
	case "Celsius a Rankine":
		temperatura.ConvertirCelsiusARankine(valor);
		break;
	
	case "Fahrenheit a Celsius":
		temperatura.ConvertirFahrenheitACelsius(valor);
		break;
	
	case "Fahrenheit a Kelvin":
		temperatura.ConvertirFahrenheitAKelvin(valor);
		break;
		
	case "Fahrenheit a Rankine":
		temperatura.ConvertirFahrenheitARankine(valor);
		break;
		
	case "Kelvin a Fahrenheit":
		temperatura.ConvertirKelvinAFahrenheit(valor);
		break;
		
	case "Kelvin a Celsius":
		temperatura.ConvertirKelvinACelsius(valor);
		break;
		
	case "Kelvin a Rankine":
		temperatura.ConvertirKelvinARankine(valor);
		break;
		
	case "Rankine a Celsius":
		temperatura.ConvertirRankineACelsius(valor);
		break;
		
	case "Rankine a Fahrenheit":
		temperatura.ConvertirRankineAFahrenheit(valor);
		break;
		
	case "Rankine a Kelvin":
		temperatura.ConvertirRankineAKelvin(valor);
		
	}
		
		
	
	
	}

}
