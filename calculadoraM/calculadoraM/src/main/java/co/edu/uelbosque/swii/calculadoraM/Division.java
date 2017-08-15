package co.edu.uelbosque.swii.calculadoraM;

public class Division implements Comando {
	@Override
	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.division(a, b);
		
	}

	public double division(double num1, double num2) {
		return num1 / num2;
	}
}
