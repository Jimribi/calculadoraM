package co.edu.uelbosque.swii.calculadoraM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void deboSumarCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("+", new Suma());
		Comando operacion = EncontrarComando.cmd("+");
		double resultado = operacion.ejecutarOperacion(3.2, 5);
		double experado = 8.2;
		Assert.assertEquals(resultado, experado);
	}

	@Test
	public void deboRestarCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("-", new Resta());
		Comando operacion = EncontrarComando.cmd("-");
		double resultado = operacion.ejecutarOperacion(11, 5);
		double experado = 6;
		Assert.assertEquals(resultado, experado);
	}

	@Test
	public void deboMultiplicarCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("*", new Multiplicacion());
		Comando operacion = EncontrarComando.cmd("*");
		double resultado = operacion.ejecutarOperacion(25, 10);
		double experado = 250;
		Assert.assertEquals(resultado, experado);
	}

	@Test
	public void deboDividirCorrectamente() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("/", new Division());
		Comando operacion = EncontrarComando.cmd("/");
		double resultado = operacion.ejecutarOperacion(200, 4);
		double experado = 50;
		Assert.assertEquals(resultado, experado);
	}

	@Test(expectedExceptions = ComandoNoEncontradoException.class)
	public void noDebeEncontrarlaOperacionPotencia() throws ComandoNoEncontradoException {
		@SuppressWarnings("unused")
		Comando operacion = EncontrarComando.cmd("^");

	}

	@Test
	public void laOperacionSumaExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("+", new Suma());
		Comando operacion = EncontrarComando.cmd("+");
		Assert.assertTrue(operacion instanceof Suma);
	}

	@Test
	public void laOperacionRestaExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("-", new Resta());
		Comando operacion = EncontrarComando.cmd("-");
		Assert.assertTrue(operacion instanceof Resta);
	}

	@Test
	public void laOperacionMultiplicacionExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("*", new Multiplicacion());
		Comando operacion = EncontrarComando.cmd("*");
		Assert.assertTrue(operacion instanceof Multiplicacion);
	}

	@Test
	public void laOperacionDivisionExiste() throws ComandoNoEncontradoException {
		EncontrarComando.addOp("/", new Division());
		Comando operacion = EncontrarComando.cmd("/");
		Assert.assertTrue(operacion instanceof Division);
	}

	@Test
	public void validaNumero() throws ComandoNoEncontradoException {
		EsNumero esNumero = new EsNumero();
		boolean resultado = esNumero.ejecutarOperacion("1");
		boolean experado = true;
		Assert.assertEquals(resultado, experado);
	}

	@Test
	public void operacionCompleta() throws NumberFormatException, ComandoNoEncontradoException
	{
		
		double resultado = App.operacion("200/4+100-5");
		double experado=145;
		Assert.assertEquals(resultado, experado);
	}
	
}
