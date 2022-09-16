package EX09;

public interface FormasGeometricas {

	// calcular quadrilateros
	double calcularRetanguloArea(double base, double altura);

	double calculaQuadrilateroPerimetro(double lado1, double lado2, double lado3, double lado4);

	double calculaRetanguloPerimetro(double base, double altura);

	// calcula circulo
	double calcularCirculoArea(double raio);

	double calcularCirculoPerimetro(double raio);

	// Calcula triangulo
	double calculaTrianguloArea(double altura, double base, double lado1, double lado2);

	double calculaTrianguloPerimetro(double base, double lado1, double lado2);

}
