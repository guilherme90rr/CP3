package EX09;

public abstract class Quadrilatero {

	private int id;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double base;
	private double altura;

	public Quadrilatero() {

	}

	public Quadrilatero(int id, double lado1, double lado2, double lado3, double lado4, double base, double altura) {

		this.id = id;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.setBase(base);
		this.setAltura(altura);

	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double calculaRetanguloPerimetro(double lado1, double lado2, double lado3, double lado4) {

		double perimetro = lado1 + lado2 + lado3 + lado4;
		return perimetro;

	}

	public double calculaRetanguloPerimetro(double base, double altura) {
		return (base * 2) + (altura * 2);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
