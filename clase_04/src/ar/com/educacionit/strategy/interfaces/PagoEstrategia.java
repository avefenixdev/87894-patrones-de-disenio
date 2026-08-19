package ar.com.educacionit.strategy.interfaces;

// Contrato que me obliga a implementar en la clase que incopore la interfaz el o los métodos que incluye
public interface PagoEstrategia {
	void pagar(int monto);
}
