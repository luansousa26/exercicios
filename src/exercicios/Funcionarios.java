package exercicios;

import javax.swing.JOptionPane;

public class Funcionarios {
 
	
	private String nomeFuncionario;
	private double salarioFuncionario;
	private String cargoFuncionario;
	
	public String getNomeFuncionario() {
		return this.nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Double getSalarioFuncionario() {
		return this.salarioFuncionario;
	}

	public void setSalarioFuncionario(Double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	
	public String getCargoFuncionario() {
		return this.cargoFuncionario;
	}
	
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
	
	public void cadastrarFuncionarios() {
		
		Funcionarios funcionarioTemp = new Funcionarios();
	    funcionarioTemp.setNomeFuncionario(JOptionPane.showInputDialog("Por gentileza preencha o nome do funcionario"));
	    funcionarioTemp.setCargoFuncionario(JOptionPane.showInputDialog("Por gentileza preencha o cargo do funcionario"));
	    try{
	    	funcionarioTemp.setSalarioFuncionario(Double.parseDouble(JOptionPane.showInputDialog("Por gentileza preencha o salário do funcionario")));
	    }catch(Exception e) {}
	   		
		JOptionPane.showMessageDialog(null,"Nome : " + funcionarioTemp.getNomeFuncionario() + " Cargo: " + funcionarioTemp.getCargoFuncionario() + "Salário: " + funcionarioTemp.getSalarioFuncionario() );
	}
	}
