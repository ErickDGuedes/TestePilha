package view;
import javax.swing.JOptionPane;

import controller.FatController;


public class Principal {

	public static void main(String[] args) {
		FatController fat = new FatController();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		System.out.println(fat.fatorial(x));
	}

}
