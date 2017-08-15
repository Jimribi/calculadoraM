package co.edu.uelbosque.swii.calculadoraM;

public class EsNumero {
	public boolean ejecutarOperacion(String a) {
		// TODO Auto-generated method stub
		return this.esnumero(a);
		
	}
	public boolean esnumero(String a) {
		try {
    		Integer.parseInt(a);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
	}
	
}
