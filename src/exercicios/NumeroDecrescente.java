package exercicios;

import javax.swing.JOptionPane;

public class NumeroDecrescente {
	
	private int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void decresceNumero(int numero) {
		if(numero != 0) {
			for(int i = numero; i > 0; i--) {
				System.out.print(numero + " ");
			     numero--;
			}
		}
	}
	
	public void getNumeroDecrescente() {
		NumeroDecrescente num = new NumeroDecrescente();
		try {
			num.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Insira um numero")));
			decresceNumero(num.getNumero());
		}catch(Exception e) {
			
		}
		
	}

}
