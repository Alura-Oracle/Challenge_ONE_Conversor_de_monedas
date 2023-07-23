package conversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversionM {
		
	ConvertirMoneda monedas = new ConvertirMoneda();
	
	public void convertirMoneda (double valor) {
	
	String opcion = JOptionPane.showInputDialog(null, "Elije la Moneda que quieras convertir", "Monedas", JOptionPane.PLAIN_MESSAGE, null, 
			new Object[]{"Pesos Colombianos a Dolares", "Pesos Colombianos a Euros","Pesos Colombianos a Libra", 
					"Pesos Colombianos a Yen", "Pesos Colombianos a Won", "Dolares a Pesos Colombianos","Euros a Pesos Colombianos",
					"Libras a Pesos Colombianos","Yen a Pesos Colombianos","Won a Pesos Colombianos"}, "Seleccion").toString();
				
	
	
	switch(opcion) {
	case "Pesos Colombianos a Dolares":
	    monedas.ConvertirPesosColombianosADolares(valor);
	    break;
	
	case "Pesos Colombianos a Euros":
		monedas.ConvertirPesosColombianosAEuros(valor); 
		break;
	
	case "Pesos Colombianos a Libra":
		monedas.ConvertirPesosColombianosALibra(valor); 
		break;
	
	case "Pesos Colombianos a Yen":
		monedas.ConvertirPesosColombianosAYen(valor); 
		break;
		
	case "Pesos Colombianos a Won":
		monedas.ConvertirPesosColombianosAWon(valor); 
		break;
		
		//Invertidas
		
	case "Dolares a Pesos Colombianos":
		monedas.ConvertirDolaresAPesosColombianos(valor);
		break;
		
	case "Euros a Pesos Colombianos":
		monedas.ConvertirEurosAPesosColombianos(valor); 
		break;
		
	case "Libras a Pesos Colombianos":
		monedas.ConvertirLibraAPesosColombianos(valor);
		break;
		
	case "Yen a Pesos Colombianos":
		monedas.ConvertirYenAPesosColombianos(valor); 
		break;
		
	case "Won a Pesos Colombianos":
		monedas.ConvertirWonAPesosColombianos(valor);
		break;
	}
	
  }
}


