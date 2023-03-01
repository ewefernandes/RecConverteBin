package view;
import javax.swing.JOptionPane;

import controller.cModulos;

public class principal {

	public static void main(String[] args) {
		cModulos m = new cModulos();
		int n = 0;
		String bin="";
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Número até 2000:"));
		} while (n > 2000);
		
		String retorno = m.calcBinario(n, bin);
		System.out.println(retorno);
		
	}

}
