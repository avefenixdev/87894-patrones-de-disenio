package ar.com.educacionit.builder.entidades;

// Tener el builder dentro de la clase Usuario

public class Usuario {
	
	private String nombre;
	private String apellido;
	private byte edad;
	private String email;
	private String telefono;
	
	private Usuario(Builder builder) {
		this.nombre = builder.nombre;
		this.apellido = builder.apellido;
		this.edad = builder.edad;
		this.email = builder.email;
		this.telefono = builder.telefono;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
	
	
	// Builder interno
	
	public static class Builder {
		private String nombre;
		private String apellido;
		private byte edad;
		private String email;
		private String telefono;
		
		public Builder(String nombre, String email) {
			this.nombre = nombre;
			this.email = email;
		}
		
		public Builder edad(byte edad) {
			this.edad = edad;
			return this;
		}
		
		public Builder telefono(String telefono) {
			this.telefono = telefono;
			return this;
		}
		
		public Builder apellido(String apellido) {
			this.apellido = apellido;
			return this;
		}
		
		public Usuario build() {
			return new Usuario(this); // this -> Builder 
		}
	}
	
	

}
