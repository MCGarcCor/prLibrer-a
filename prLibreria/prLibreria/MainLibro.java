package prLibreria;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		double pBase;
		Libro pFinal;

		Scanner sc = new Scanner(System.in);

		System.out.println("Precio del art�culo: ");
		pBase = sc.nextDouble();

		pFinal = new Libro("George Orwell", "Rebeli�n en la granja", pBase);

		System.out.println("El precio final es " + pFinal.precioFinal());

		sc.close();

		LibroOferta L1 = new LibroOferta("George Orwell", "Rebeli�n en la granja", 10, 0.10);

		System.out.println(L1);

	}

}
