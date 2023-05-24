package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.arvoreint.Arvore;

public class Controller {

	public void Percorre(Arvore arvore, int opc) {
		switch (opc) {
		case 1:
			try {
				arvore.prefixSearch();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("");
			break;
		case 2:
			try {
				arvore.infixSearch();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("");
			break;
		case 3:
			try {
				arvore.postfixSearch();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("");
			break;
		case 9:
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida.");
		}
	}
}
