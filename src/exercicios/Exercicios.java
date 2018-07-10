package exercicios;

import javax.swing.JOptionPane;

public class Exercicios {

	
	
	public static void main(String args[]) {
         Exercicios ex = new Exercicios();
		/*Funcionarios func = new Funcionarios();
		func.cadastrarFuncionarios();
		
		MaiorNumero maior = new MaiorNumero();
		maior.getNumeros();*/
		
		/*NumeroDecrescente num = new NumeroDecrescente();
		num.getNumeroDecrescente();*/
		
        // ex.numerosParesImpares();
         
        /* TrocaNumero tr = new TrocaNumero();
         tr.alteraNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o NumA")), Integer.parseInt(JOptionPane.showInputDialog("Digite o NumB")));*/
}
	
	public void numerosParesImpares() {
		final int valor = 30;
		int impares = 0;
		long pares = 1;
		
		for(int i = 0; i <= valor; i++) {
			if(i % 2 == 0) {
				if(i != 0) {
					pares = pares * i;
				}
			} else {
				impares = impares + i;
			}
		}
		System.out.print("Pares: " + pares + " Impares: " + impares);
	}
}
