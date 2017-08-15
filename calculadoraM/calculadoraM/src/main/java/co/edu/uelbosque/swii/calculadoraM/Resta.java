package co.edu.uelbosque.swii.calculadoraM;

public class Resta implements Comando {

	@Override
	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.resta(a, b);
		
	}
	public double resta(double num1, double num2) {
		return num1 - num2;
	}
}
