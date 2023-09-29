package root;

import entidades.Punto;
import servicios.PuntoServicio;

public class Main {

	public static void main(String[] args) {
		
		PuntoServicio puntoServicio = new PuntoServicio();
		
		System.out.println("Pedimos los datos del punto1");
		Punto p1 = puntoServicio.obtenerDatos();
		System.out.println("Pedimos los datos del punto2");
		Punto p2 = puntoServicio.obtenerDatos();
		System.out.println(p1);
		System.out.println(p2);
		
		puntoServicio.sumarPuntos(p1, p2);
		puntoServicio.calcularDistancia(p1, p2);
		puntoServicio.obtenerRecta(p1, p2);
	}

}
