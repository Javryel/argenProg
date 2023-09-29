package servicios;

import java.util.Scanner;

import entidades.Punto;

public class PuntoServicio {

	private Scanner sc;

	public PuntoServicio() {
		this.sc = new Scanner(System.in);
	}

	public Punto obtenerDatos() {
		Punto p1 = new Punto();
		System.out.println("Ingresar coordenada X del punto");
		p1.setCoordenadaX(sc.nextDouble());
		System.out.println("Ingresar coordenada Y del punto");
		p1.setCoordenadaY(sc.nextDouble());

		return p1;
	}

	public void sumarPuntos(Punto p1, Punto p2) {
		Double sumaX = (p1.getCoordenadaX() + p2.getCoordenadaX());
		Double sumaY = (p1.getCoordenadaY() + p2.getCoordenadaY());
		System.out.println("(" + sumaX + ";" + sumaY + ")");
	}

	public void calcularDistancia(Punto p1, Punto p2) {
		Double cateto1 = p2.getCoordenadaX() - p1.getCoordenadaX();
		Double cateto2 = p1.getCoordenadaY() - p2.getCoordenadaY();

		Double distancia = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println(distancia);
	}

	public void obtenerRecta(Punto p1, Punto p2) {

		if ((p1.getCoordenadaX() - p2.getCoordenadaX()) == 0) {
			System.out.println("No es una funcion recta ");
		} else {
			Double pendiente = (p1.getCoordenadaY() - p2.getCoordenadaY())
					/ (p1.getCoordenadaX() - p2.getCoordenadaX());
			Double orAlOrigen = pendiente * (-p1.getCoordenadaX()) + p1.getCoordenadaY();

			System.out.println("La eecuacion de la recta es: Y es = " + pendiente + "X +" + orAlOrigen);
		}
	}
}
