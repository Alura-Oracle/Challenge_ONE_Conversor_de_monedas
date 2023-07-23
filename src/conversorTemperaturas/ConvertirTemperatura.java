package conversorTemperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirCelsiusAFahrenheit (double valor) { 
		double tempFahrenheit = valor * 33.8;
		tempFahrenheit = (double)Math.round(tempFahrenheit * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempFahrenheit + " Fahrenheit"); 
		}
	
	public void ConvertirCelsiusAKelvin (double valor) { 
		double tempKelvin = valor * 274.15;
		tempKelvin = (double)Math.round(tempKelvin * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempKelvin + " Kelvin"); 
		}
	
	public void ConvertirCelsiusARankine (double valor) { 
		double tempRankine = valor * 493.47;
		tempRankine = (double)Math.round(tempRankine * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempRankine + " Rankine"); 
		}
	
	public void ConvertirFahrenheitACelsius (double valor) { 
		double tempCelsius = valor * -17.22;
		tempCelsius = (double)Math.round(tempCelsius * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempCelsius + " Celius"); 
		}
	
	public void ConvertirFahrenheitAKelvin (double valor) { 
		double tempKelvin = valor * 255.93;
		tempKelvin = (double)Math.round(tempKelvin * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempKelvin + " Kelvin"); 
		}

	public void ConvertirFahrenheitARankine (double valor) { 
		double tempRankine = valor * 460.67;
		tempRankine = (double)Math.round(tempRankine * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempRankine + " Rankine"); 
		}
	
	public void ConvertirKelvinAFahrenheit (double valor) { 
		double tempFahrenheit = valor * - 457.87;
		tempFahrenheit = (double)Math.round(tempFahrenheit * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempFahrenheit + " Fahrenheit"); 
		}
	
	public void ConvertirKelvinACelsius (double valor) { 
		double tempCelsius = valor * - 272.15;
		tempCelsius = (double)Math.round(tempCelsius * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempCelsius + " Celsius"); 
		}
	
	public void ConvertirKelvinARankine (double valor) { 
		double tempRankine = valor * 1.8 ;
		tempRankine = (double)Math.round(tempRankine * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempRankine + " Rankine"); 
		}
	
	public void ConvertirRankineAFahrenheit (double valor) { 
		double tempFahrenheit = valor * - 458.67;
		tempFahrenheit = (double)Math.round(tempFahrenheit * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempFahrenheit + " Fahrenheit"); 
		}
	
	public void ConvertirRankineACelsius (double valor) { 
		double tempCelsius = valor * - 272.59;
		tempCelsius = (double)Math.round(tempCelsius * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " + tempCelsius + " Celsius"); 
		}
	
	public void ConvertirRankineAKelvin (double valor) { 
		double tempKelvin = valor * 0.56;
		tempKelvin = (double)Math.round(tempKelvin * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes  " +  tempKelvin  + " Kelvin"); 
		}

}
