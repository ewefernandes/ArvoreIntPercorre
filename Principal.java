package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.arvoreint.Arvore;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int vetor[] =  {33, 15, 41, 38, 47, 34, 49, 43};
		Controller c = new Controller();
		Arvore arvore = new Arvore();
		int opc = 0;
		
		for (int i : vetor) {
			arvore.insert(i);
		}
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Pre-ordem; 2- Em ordem; 3- Pos-ordem; 9- Sair."));
			c.Percorre(arvore, opc);
		} while (opc != 9);
	}

}
