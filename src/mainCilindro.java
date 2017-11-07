import prCilindro.Cilindro;
import prCilindro.Circulo;
import prPunto.Punto;

public class mainCilindro {

	public static void main(String[] args) {
		Punto centroCirculo = new Punto(5,-3);
		Circulo base = new Circulo(centroCirculo,5);
		Cilindro c= new Cilindro(base,10);
		System.out.println(c);
		System.out.println("Área: " + c.area());
		System.out.println("Volumen: "+ c.volumen());
		c.trasladar(2,3);
		System.out.println(c);
		System.out.println("Área: " + c.area());
		System.out.println("Volumen: "+ c.volumen());
	}

}
