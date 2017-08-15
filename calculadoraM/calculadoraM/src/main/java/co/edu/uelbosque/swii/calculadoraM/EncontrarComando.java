package co.edu.uelbosque.swii.calculadoraM;

import java.util.HashMap;

public class EncontrarComando {

	private static HashMap<String, Comando> operaciones;

	public static Comando cmd(String key) throws ComandoNoEncontradoException {

		if (operaciones.containsKey(key)) {
			return operaciones.get(key);
		}
		throw new ComandoNoEncontradoException();
	}

	public static void addOp(String signo, Comando c) {
		if (operaciones == null) {
			operaciones = new HashMap<String, Comando>();
			operaciones.put(signo, c);
		} else if ((operaciones.containsKey(signo)) == false) {
			operaciones.put(signo, c);
		}
	}
	
	public static void incluirOP() {
		addOp("+", new Suma());
		addOp("-", new Resta());
		addOp("*", new Multiplicacion());
		addOp("/", new Division());
	}
}
