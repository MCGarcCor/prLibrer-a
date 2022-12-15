package prLibreria;

//Clase hija de Libro
public class LibroOferta extends Libro {
	
	//Atributo
	
	private double porcDescuento;

	//M�todo constructor con  atributos propios y del padre
	
	public LibroOferta(String autor, String titulo, double precioBase, double porcDescuento) {
		super(autor, titulo, precioBase);
		this.porcDescuento = porcDescuento;
	}
	
	//M�todos de consulta
	public double getPorcDescuento() {
		return porcDescuento;
	}
	
	public double precioFinalD () {
		
		double pb=precioFinal();
		
		return pb - (pb*porcDescuento);
	}
	
	//M�todo String para imprimir el precio final
	public String toString() {
		return ("El precio con descuento es " + this.precioFinalD());
	}

}
