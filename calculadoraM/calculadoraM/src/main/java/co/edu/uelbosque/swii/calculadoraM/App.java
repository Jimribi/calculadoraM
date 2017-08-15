package co.edu.uelbosque.swii.calculadoraM;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws NumberFormatException, ComandoNoEncontradoException {
		// TODO Auto-generated method stub
		EncontrarComando.incluirOP();
		System.out.println("Introduzca Operacion a realizar");
		String entradaTeclado = "";
		double resultado;
		@SuppressWarnings("resource")
		Scanner entradaEscanner = new Scanner(System.in);
		entradaTeclado = entradaEscanner.nextLine();
		resultado = operacion(entradaTeclado);
		System.out.println("El resultado de la operacion " + entradaTeclado + " es: " + resultado);
	}

	static double operacion(String cadena) throws NumberFormatException, ComandoNoEncontradoException {
		EsNumero esNumero = new EsNumero();
		String armaNumero = "";
		String signoOperador = "";
		String operando1 = "";
		String operando2 = "";
		for (int i = 1; i <= cadena.length(); i++) {

			if (esNumero.ejecutarOperacion((cadena.substring((i - 1), i)))) {
				armaNumero = armaNumero + cadena.substring((i - 1), i);
			} else {
				if (operando1 == "") {
					operando1 = armaNumero;
					signoOperador = cadena.substring((i - 1), i);
					armaNumero = "";
				} else if (operando2 == "") {
					operando2 = armaNumero;
					Comando operacion = EncontrarComando.cmd(signoOperador);
					operando1 = String.valueOf(operacion.ejecutarOperacion(Double.parseDouble(operando1), Double.parseDouble(armaNumero)));
					signoOperador = cadena.substring((i - 1), i);
					operando2 = "";
					armaNumero = "";
				}
			}
		}
		Comando operacion = EncontrarComando.cmd(signoOperador);
		operando1 = String.valueOf(operacion.ejecutarOperacion(Double.parseDouble(operando1), Double.parseDouble(armaNumero)));
		return Double.parseDouble(operando1);
	}


}
