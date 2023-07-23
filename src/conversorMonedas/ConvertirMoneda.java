package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void ConvertirPesosColombianosADolares (double valor) { 
		double monedaDolar = valor * 0.00025;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares"); 
		}
				
	public void ConvertirPesosColombianosAEuros (double valor) {
		double monedaEuro = valor * 0.000226; 
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros"); 
		}

	public void ConvertirPesosColombianosALibra (double valor) {
		double monedalibra = valor * 0.000195;
		monedalibra = (double)Math.round(monedalibra * 1000d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedalibra + " Libras Esterlinas"); 
		}

	public void ConvertirPesosColombianosAYen (double valor) { 
		double monedayen = valor * 0.03524;
	    monedayen = (double)Math.round(monedayen * 100d) /100; 
	    JOptionPane.showMessageDialog(null, "Tienes $ " + monedayen + " Yen Japonés");
	    }

	public void ConvertirPesosColombianosAWon (double valor) { 
		double monedawon = valor * 0.3220;
	    monedawon = (double)Math.round(monedawon* 1000) /100; 
	    JOptionPane.showMessageDialog(null, "Tienes $ " + monedawon + " Won sub-coreano");
	}

	
	//Conversion de Monedas invertidas
	
	public void ConvertirDolaresAPesosColombianos (double valor) { 
		double monedaDolar = 3.976 * valor;
	    monedaDolar = (double)Math.round(monedaDolar * 1000) /100; 
	    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " en pesos Colombianos ");
	}
	
	public void ConvertirEurosAPesosColombianos (double valor) { 
		double monedaEuro = 4.424 * valor;
		monedaEuro = (double)Math.round(monedaEuro * 1000) /100; 
	    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " en pesos Colombianos ");
	}
	
	public void ConvertirLibraAPesosColombianos (double valor) {
		double monedaLibra = valor * 5.102;
		monedaLibra = (double)Math.round(monedaLibra * 1000d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " en pesos Colombianos"); 
	}
	
	public void ConvertirYenAPesosColombianos (double valor) {
		double monedaYen = valor * 28.1451;
		monedaYen = (double)Math.round(monedaYen * 1000d) /100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " en pesos Colombianos"); 
	}
	
	public void ConvertirWonAPesosColombianos (double valor) { 
		double monedawon = valor * 3.0930;
	    monedawon = (double)Math.round(monedawon* 1000) /100; 
	    JOptionPane.showMessageDialog(null, "Tienes $ " + monedawon + " en pesos Colombianos");
	}
}
