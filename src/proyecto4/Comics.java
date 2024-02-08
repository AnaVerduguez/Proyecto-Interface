package proyecto4;

import java.util.Date;

public class Comics extends Libro {
	private String personaje;

	public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String persona) {
		super(precio, fechaPublicacion, autor, titulo, editorial);
		this.personaje = persona;
	}

	public String getPersona() {
		return personaje;
	}

	@Override
	public String toString() {
		return "Comics [Personaje= " + personaje + "]";
	}
	
	//Metodo que se implementa de la interfaz IProducto
	@Override
	public double getPrecioVenta() {
		return precio;
	}
}
