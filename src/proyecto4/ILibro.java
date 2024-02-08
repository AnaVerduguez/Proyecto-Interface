package proyecto4;

//Importamos el paquete Date que me permite manejar fechas actuales
import java.util.Date;

public interface ILibro {
	public Date getFechaPublicacion();
	public String getAutor();
	public String getTitulo();
	public String getEditorial();

}
