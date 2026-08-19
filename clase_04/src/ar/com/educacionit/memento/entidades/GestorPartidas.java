package ar.com.educacionit.memento.entidades;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.memento.interfaces.Memento;

public class GestorPartidas {

	private List<Memento> checkpoints = new ArrayList<>();
	
	public void add(Memento memento) {
		this.checkpoints.add(memento);
	}
	
	public Memento get(int index) {
		return this.checkpoints.get(index);
	}
	
	public String getCheckPoints() {
		return this.checkpoints.toString();
	}
	
}
