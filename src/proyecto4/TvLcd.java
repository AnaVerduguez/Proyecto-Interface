package proyecto4;

public class TvLcd extends Electronico{
	private int pulgada;

	public TvLcd(int precio, String fabricante, int pulgada) {
		super(precio, fabricante);
		this.pulgada = pulgada;
	}

	public int getPulgada() {
		return pulgada;
	}

	@Override
	public String toString() {
		return "TvLcd [Fabricante= "+ fabricante + ", Pulgada= " + pulgada + "]";
	}
	
	//Metodo que se implementa de la interfaz IProducto
	@Override
	public double getPrecioVenta() {
		return precio;
	}
}
