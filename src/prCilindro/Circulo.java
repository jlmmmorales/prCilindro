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
	 * Devuelve el radio del círculo
	 * 
	 * @return Radio del círculo
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * Modifica el radio del círculo, sustituyéndolo por el valor pasado.
	 * Si el radio pasado no es positivo, no se hace nada.
	 * 
	 * @param radio El nuevo radio del círculo
	 * 
	 */
	public void setRadio(double radio) {
		if (radio > 0){
			this.radio = radio;
		}
	}

	/**
	 * Devuelve el centro del círculo.
	 * 
	 * @return el punto que es el centro del círculo
	 */
	public Punto getCentro() {
		return centro;
	}
	
	/**
	 * Modifica el centro del círculo.
	 * Si el punto pasado como parémetro es null, no se hace nada.
	 * 
	 * @param centro objeto Punto que será el nuevo centro del círculo
	 */
	public void setCentro(Punto centro) {
		if (centro != null){
			this.centro = centro;
		}
	}
	
	/**
	 * Desplaza el círculo a otra localización en el espacio.
	 * 
	 * @param x Número de unidades en el eje OX en que se desplaza el círculo
	 * @param y Número de unidades enel eje OY en que se desplaza el círculo
	 */
	public void trasladar(double x, double y){
		centro.trasladar(x, y);
	}
	
	@Override
	public String toString(){
		return "Circulo( " + centro + "," + radio + ")";
	}
}
