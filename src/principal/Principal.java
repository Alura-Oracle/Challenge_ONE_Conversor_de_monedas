package principal;

import javax.swing.*;

import conversorMonedas.OpcionesConversionM;
import conversorTemperaturas.OpcionesConversionT;

public class Principal {

	public static void main(String[] args) {

		// Insertar imagen
		ImageIcon icon1 = new ImageIcon("src/principal/imagen.jpg");
		// Agrega JLabel para colocar la imagen
		JLabel label1 = new JLabel(icon1);
		// Establece la posición y el tamaño de la etiqueta, el tamaño de la etiqueta es
		// el tamaño de la imagen
		label1.setBounds(0, 0, icon1.getIconWidth(), icon1.getIconHeight());

		// marco JFrame
		JFrame frame = new JFrame();
		// Añadir etiqueta al contenedor inferior del marco
		frame.getLayeredPane().add(label1, new Integer(Integer.MIN_VALUE));

		// panel
		JPanel panel = new JPanel();

		// panelTop, el contenedor superior
		JPanel panelTop = new JPanel();
		panelTop = (JPanel) frame.getContentPane();

		// Panel y panelTop set transparente
		panelTop.setOpaque(false);
		panel.setOpaque(false);

		// label0, esta es una operación personalizada en la interfaz, utilizada como
		// visualización de efectos
		JLabel label0 = new JLabel("");
		panel.add(label0);

		// Agregar panel, establecer tamaño, visual
		frame.add(panel);
		frame.setSize(1380, 800);
		frame.setVisible(true);

		OpcionesConversionM conversion = new OpcionesConversionM();
		OpcionesConversionT conversionT = new OpcionesConversionT();

		while (true) {

			try {
				String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
						JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Seleccion")).toString();

				switch (opciones) {

				case "Conversor de Moneda":
					String input = JOptionPane.showInputDialog(null, "Ingresa el valor a convertir: ",
							"Solo se permiten caracteres numericos ", JOptionPane.WARNING_MESSAGE);
					if (ValidarNumero(input) == true) {
						double Minput = Double.parseDouble(input);
						conversion.convertirMoneda(Minput);

						int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
						if (JOptionPane.OK_OPTION == respuesta) {
							System.out.println("Selecciona opción Afirmativa");
						} else {
							JOptionPane.showMessageDialog(null, "Programa terminado");

						}

					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido", null, JOptionPane.ERROR_MESSAGE);
					}
					break;

				case "Conversor de Temperatura":
					input = JOptionPane.showInputDialog(null, "Ingresa el valor a convertir ",
							"Solo se permiten caracteres numericos ", JOptionPane.WARNING_MESSAGE);
					if (ValidarNumero(input) == true) {
						double Minput = Double.parseDouble(input);
						conversionT.ConvertirTemperatura(Minput);

						int respuesta = 0;
						respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
						if ((respuesta == 0) && (ValidarNumero(input) == true)) {
						} else {
							JOptionPane.showMessageDialog(null, "Programa terminado");

						}

					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido", null, JOptionPane.ERROR_MESSAGE);
					}

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				frame.setVisible(false);
				break;

			}
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
