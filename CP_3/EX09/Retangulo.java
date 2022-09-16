package EX09;

import formas.Quadrilatero;

public class Retangulo extends Quadrilatero {

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Retangulo() {

	}

	public Retangulo(double base, double altura) {

		this.base = base;
		this.altura = altura;

	}

}
