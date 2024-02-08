package proyecto4;

//Importamos el paquete Date que me permite manejar fechas actuales
import java.util.Date;

public class ProyectoCatalogo {
	public static void main(String[] args) {
		
		//Creo 2 objetos por clase -> IPhone|TvLcd|Libro|Comics
		IProducto[] productos = new Producto [8];
		
		productos[0] = new IPhone (306745, "Apple", "iPhone 11 - 128 GB" , "Negro");
		productos[1] = new IPhone (418989, "Apple", "iPhone 13 - 128 GB" , "Azul");
		
		productos[2] = new TvLcd (152999, "Smart TV 4K UHD Samsung", 50);
		productos[3] = new TvLcd (299999, "Smart TV LED 4K Sony", 55);
		
		productos[4] = new Libro (6699, new Date(), "Sigman Mariano", "El poder de las palabras", "Debate");
		productos[5] = new Libro (4500, new Date(), "Numer Lucia", "Adiós cachorra", "Planeta");
		
		productos[6] = new Comics (1799, new Date(), "Masashi Kishimoto", "Naruto # 03", "Panini", "Naruto");
		productos[7] = new Comics (1699, new Date(), "Ohba Tsugumi", "Death Note Vol 5", "Ivrea", "Light Yagami");
		
		
		//Muestro los objetos con sus detalles del arreglo anterior con un forEach 
		for (IProducto producto : productos) {
			System.out.println(producto.toString());
			System.out.println("Precio= " + producto.getPrecioVenta());
			System.out.println("-----------------------------------------------------------------------");
			}
	}
}
