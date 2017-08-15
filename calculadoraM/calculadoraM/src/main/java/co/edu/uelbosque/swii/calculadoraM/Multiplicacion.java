package co.edu.uelbosque.swii.calculadoraM;

public class Multiplicacion implements Comando {

	@Override
	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.multiplicacion(a, b);
		
	}
	public double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}
}
