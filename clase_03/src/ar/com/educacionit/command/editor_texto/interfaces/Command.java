package ar.com.educacionit.command.editor_texto.interfaces;
// Contrato, obliga a todos las clases que implementen este contrato 
// a tener los métodos ejecutar(), volverAtras() 
public interface Command {
	void ejecutar();
	void volverAtras(); // Ctrl + Z
}
