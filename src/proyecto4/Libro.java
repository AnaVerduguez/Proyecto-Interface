package proyecto4;

//Importamos el paquete Date que me permite manejar fechas actuales
import java.util.Date;

//Creo una clase heredarada. La superclase es Producto y la subclase es Libro, a su vez se implementa la interface ILibro
public class Libro extends Producto implements ILibro{
	private Date fechaPublicacion;
	private String autor, titulo, editorial;
	
	public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
		super(precio);
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public String toString() {
		return "Libro [Fecha Publicacion= " + fechaPublicacion + ", Autor= " + autor + ", Titulo= " + titulo
				+ ", Editorial= " + editorial + "]";
	}
	
	//Metodo que se implementa de la interfaz IProducto
	@Override
	public double getPrecioVenta() {
		return precio;
	}
}
