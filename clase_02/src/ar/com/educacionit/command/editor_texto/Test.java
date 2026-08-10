package ar.com.educacionit.command.editor_texto;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 02 -> Patrón Command");
		
		// https://refactoring.guru/es/design-patterns/command
		// Patrón command (Comportamiento)
		
		// El patrón command sirve para separar quién pide una acción de quién ejecuta la acción
		// O sea nos obliga a no mezclar la lógica del botón/shorcut con la lógica de ejecución
		
		// Comando concreto -> EscribirComando
		// RECEIVER -> Recibe la tarea a realizar -> EditorTexto
		// INVOKER -> Invoca -> CommandManager
		
		// Recibe (Receiver)
	}

}
