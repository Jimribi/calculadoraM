package co.edu.uelbosque.swii.calculadoraM;

public class Suma implements Comando {

	@Override
	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.suma(a, b);
		
	}
	public double suma(double num1, double num2) {
		return num1 + num2;
	}

}
