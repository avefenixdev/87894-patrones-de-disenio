package ar.com.educacionit.command.editor_texto;

import ar.com.educacionit.command.editor_texto.entidades.CommandManager;
import ar.com.educacionit.command.editor_texto.entidades.EditorTexto;
import ar.com.educacionit.command.editor_texto.entidades.EscribirComando;
import ar.com.educacionit.command.editor_texto.interfaces.Command;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 03 -> Patrón Command");
		
		// https://refactoring.guru/es/design-patterns/command
		// Patrón command (Comportamiento)
		
		// El patrón command sirve para separar quién pide una acción de quién ejecuta la acción
		// O sea nos obliga a no mezclar la lógica del botón/shorcut con la lógica de ejecución
		// Comando abstracto -> interfaces -> Command
		// Comando concreto -> EscribirComando
		// RECEIVER -> Recibe la tarea a realizar -> EditorTexto
		// INVOKER -> Invoca -> CommandManager
		
		// Recibe (Receiver)
		
		EditorTexto editor = new EditorTexto();
		
		// Invoca (Invoker)
		
		CommandManager manager = new CommandManager();
		
		// Comandos Concretos
		Command escribirHola = new EscribirComando(editor, "Hola ");
		manager.ejecutarComando(escribirHola); // "Hola "
		
		Command escribirMundo = new EscribirComando(editor, "Mundo");
		manager.ejecutarComando(escribirMundo);
		
		System.out.println("Texto actual: " + editor.getTexto()); // "Hola Mundo"
		
		manager.deshacerUltimo();
		
		System.out.println("Texto luego del borrar: " + editor.getTexto()); // "Hola "
		
		
		// Diagramas UML bonitos -> https://www.planttext.com/
		
		
	}

}
