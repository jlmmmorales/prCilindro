package prCilindro;

/**
 * @Author Alumno
 * @Version 1
**/
public class Cilindro {
	//Variables de instancia
	private Circulo base;
	private double altura;
	
	//Constructores
	public Cilindro(){
		base = new Circulo();
		altura = 1;
	}
	
	public Cilindro(Circulo b, double a){
		base = b;
		altura = a;
	}

	//Métodos de instancia
	
	/**
	 * Método que devuelve la base del cilindro
	 * 
	 * @return el objeto de clase Círculo que es la base del cilindro.
	 */
	public Circulo getBase() {
		return base;
	}

	/**
	 * Método que modifica la base del Cilindro.
	 * Si el parámetro pasado es null no se cambia nada.
	 * 
	 * @param base la nueva base para el cilindro
	 */
	public void setBase(Circulo base) {
		if (base != null){
			this.base = base;
		}
	}

	/**
	 * Método que devuelve la altura del cilindro
	 * 
	 * @return altura del cilindro
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Método que modifica la altura del cilindro.
	 * Si la pasada no es positiva, no se cambia nada.
	 * 
	 * @param nueva altura
	 */
	public void setAltura(double altura) {
		if (altura >= 0){
			this.altura = altura;
		}
	}
	
	/**
	 * Método que mueve el cilindro.
	 * 
	 * @param x Unidades en el eje de abscisas en que se mueve el cilindro
	 * @param y Unidades en el eje de ordenadas en que se mueve el cilindro
	 */
	public void trasladar(double x, double y){
		base.trasladar(x, y);
	}
	
	@Override
	public String toString(){
		
		return "Cilindro [Base " + base.toString() + ", Altura " + altura + "]";
		
	}
	
	/**
	 * Calcula el área del cilindro según la expresión
	 * 2 * pi * radio_base * (altura + radio_base)
	 * 
	 * @return Área del cilindro
	 */
	public double area(){
		double radioBase = base.getRadio();
		return (2 * Math.PI * radioBase * (altura + radioBase ));
	}
	
	/**
	 * Calcula el volumen del cilindro mediante la expresión
	 * pi * radio_base * radio_base * altura
	 * 
	 * @return Volumen del cilindro
	 */
	public double volumen(){
		double radioBase = base.getRadio();
		return (Math.PI * radioBase * radioBase * altura);
	}
}
