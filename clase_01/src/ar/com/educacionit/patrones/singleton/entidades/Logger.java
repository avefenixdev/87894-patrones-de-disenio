package ar.com.educacionit.patrones.singleton.entidades;

public class Logger {
	
	// atributo de instancia
	// atributo de clase <--- usar la palabra static
	private static Logger instancia;
	
	// El constructor se automaticamente cuando hago un new.
	private Logger() {} // No quiero tener el constructor disponible.
	
	public static Logger getInstancia() {
		if ( instancia == null ) {
			instancia = new Logger();
		}
		return instancia;
	}
	
	public void log(String mensaje) {
		System.out.println("[LOG]: " + mensaje);
	}

}
