package ar.com.educacionit.command.editor_texto.entidades;

public class EditorTexto {

	private StringBuilder texto = new StringBuilder();
	// Es una clase que nos permite gestionar cadenas de manera eficiente
	// String texto = "Hola";
	// texto = texto + " Max";
	// texto = texto + "!";
	//String nombre = "Maxi";
	//String texto = "Hola " + nombre + "!";
	
	// texto.append("Hola");
	// texto.append(" ");
	// texto.append("Max");
	// texto.append("!");
	
	// append() | insert() | delete() | replace() | toString()
	
	public void escribir(String palabra) {
		texto.append(palabra);
		// -> 1 escribir("Hola ")
		// ""
		// "Hola "
		// -> 2 escribir("Pepe")
		// "Hola Pepe"
		
	}
	
	public void borrar(int distancia) {
		// delete(start, end) 
		// "Hola Pepe" <---- texto
		// borrar("Pepe".lenght()) <--- distancia
		// texto.length() - distancia, texto.length()
		//       9        -     4    ,       9
		texto.delete(texto.length() - distancia, texto.length());
	}
	
	public String getTexto() {
		return texto.toString();
	}
		
}
