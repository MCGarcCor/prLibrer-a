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

		//Métodos de consulta
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
		
		//Método toString para imprimir el precio final
		public String toString() {
			
			return ("El precio final es " + this.precioFinal());
		}

		//Métodos de consulta para la varible estática IVA
		public static double getIVA() {
			return porcIVA;
		}

		public static void setIVA(double IVA) {
			porcIVA = IVA;
		}

}
