package exercicios;

import javax.swing.JOptionPane;

public class MaiorNumero {
	private int primeiroNumero;
	private int segundoNumero;
	
	public void setPrimeiroNumero(int primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	public int getPrimeiroNumero() {
		return this.primeiroNumero;
	}
	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	public int getSegundoNumero() {
		return this.segundoNumero;
	}
	
	public int verificaMaior(int primeiroNumero, int segundoNumero) {
		if(primeiroNumero > segundoNumero ) {
			return primeiroNumero;
		} else {
			return segundoNumero;
		}
	}
	
	public void getNumeros() {
      MaiorNumero maior = new MaiorNumero();
      maior.setPrimeiroNumero(Integer.parseInt( JOptionPane.showInputDialog("Por gentileza digite o primeiro n�mero")));
	  maior.setSegundoNumero(Integer.parseInt(JOptionPane.showInputDialog("Por gentileza digite o segundo n�mero")));
	  JOptionPane.showMessageDialog(null, "O maior n�mero �: " + maior.verificaMaior(maior.getPrimeiroNumero(), maior.getSegundoNumero()));
	}

}
