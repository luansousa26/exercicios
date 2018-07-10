package exercicios;

public class TrocaNumero {
	
	private int numA;
	private int numB;
	
	public void alteraNumero(int numA, int numB) {
		this.numA = numB;
		this.numB = numA;
		System.out.print("NumA: " + this.numA + " NumB: " + this.numB);
	}

}
