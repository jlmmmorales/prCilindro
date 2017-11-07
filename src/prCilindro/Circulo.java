package prCilindro;
/**
 * @Author 
 * @Version
 */

import prPunto.Punto;

public class Circulo {
	//Variables de instancia
	private double radio;
	private Punto centro;
	
	//Constructores
	public Circulo(){
		this(new Punto(),1);
	}

	public Circulo (Punto c, double r){
		centro = c; 
		radio = r;
	}

	/**
	 * Devuelve el radio del c�rculo
	 * 
	 * @return Radio del c�rculo
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * Modifica el radio del c�rculo, sustituy�ndolo por el valor pasado.
	 * Si el radio pasado no es positivo, no se hace nada.
	 * 
	 * @param radio El nuevo radio del c�rculo
	 * 
	 */
	public void setRadio(double radio) {
		if (radio > 0){
			this.radio = radio;
		}
	}

	/**
	 * Devuelve el centro del c�rculo.
	 * 
	 * @return el punto que es el centro del c�rculo
	 */
	public Punto getCentro() {
		return centro;
	}
	
	/**
	 * Modifica el centro del c�rculo.
	 * Si el punto pasado como par�metro es null, no se hace nada.
	 * 
	 * @param centro objeto Punto que ser� el nuevo centro del c�rculo
	 */
	public void setCentro(Punto centro) {
		if (centro != null){
			this.centro = centro;
		}
	}
	
	/**
	 * Desplaza el c�rculo a otra localizaci�n en el espacio.
	 * 
	 * @param x N�mero de unidades en el eje OX en que se desplaza el c�rculo
	 * @param y N�mero de unidades enel eje OY en que se desplaza el c�rculo
	 */
	public void trasladar(double x, double y){
		centro.trasladar(x, y);
	}
	
	@Override
	public String toString(){
		return "Circulo( " + centro + "," + radio + ")";
	}
}
