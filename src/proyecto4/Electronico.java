package proyecto4;

//Creo una clase heredarada. La superclase es Producto y la subclase es Electronico, a su vez se implementa la interface IE
public abstract class Electronico extends Producto implements IElectronico{
	protected String fabricante;

	public Electronico(int precio, String fabricante) {
		super(precio);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	@Override
	public String toString() {
		return "Electronico [Fabricante= " + fabricante + "]";
	}
}
