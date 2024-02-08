package proyecto4;

public class IPhone extends Electronico{
	private String modelo;
	private String color;

	public IPhone(int precio, String fabricante, String modelo, String color) {
		super(precio, fabricante);
		this.modelo = modelo;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "IPhone [Fabricante= "+ fabricante + ", Modelo= " + modelo + ", Color= " + color + "]";
	}
	
	//Metodo que se implementa de la interfaz IProducto
	@Override
	public double getPrecioVenta() {
		return precio;
	}
}
