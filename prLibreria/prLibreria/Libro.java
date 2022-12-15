package prLibreria;

public class Libro {
	
	//Atributos
	
		static double porcIVA=0.21;
		private String autor;
		private String titulo;
		private double precioBase;
		
		//Metodo constructor
		public Libro (String autor, String titulo, double precioBase) {
			
			this.autor=autor;
			this.titulo=titulo;
			this.precioBase=precioBase;
		}

		//M�todos de consulta
		public String getAutor() {
			return autor;
		}

		public String getTitulo() {
			return titulo;
		}

		public double getPrecioBase() {
			return precioBase;
		}
		
		public double precioFinal() {
					
			return (precioBase*porcIVA)+precioBase;
		}
		
		//M�todo toString para imprimir el precio final
		public String toString() {
			
			return ("El precio final es " + this.precioFinal());
		}

		//M�todos de consulta para la varible est�tica IVA
		public static double getIVA() {
			return porcIVA;
		}

		public static void setIVA(double IVA) {
			porcIVA = IVA;
		}

}
