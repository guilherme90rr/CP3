package EX09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import formas.Circulo;
import formas.Quadrado;
import formas.Triangulo;

public class Sistema {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);

		ArrayList<Circulo> circulosLista = new ArrayList<>();
		ArrayList<Quadrado> quadrilateroLista = new ArrayList<>();
		ArrayList<Triangulo> trianguloLista = new ArrayList<>();

		int option;
		int confirmar;
		int id;

		double area;
		double perimetro;

		do {

			System.out.printf("SISTEMA DE CRIACAO DE FORMAS \n\n" +
					"Escolha qual tipo de forma voce deseja criar:\n" +
					"1) Circulo\n" +
					"2) Quadrilatero\n" +
					"3) Triangulo\n" +
					"4) Sair\n\n");
			System.out.printf("Digite a opcao desejada => ");

			option = ler.nextInt();

			if (option == 1) {

				do {

					Circulo c = new Circulo();

					id = circulosLista.size() + 1;
					c.setId(id);

					System.out.printf("Digite o tamanho do raio=> ");
					double raio = ler.nextDouble();
					c.setRaio(raio);

					System.out.printf("As informacoes estao corretas? +\n\n" +
							"0 - REFAZER\n" +
							"1 - CONFIRMAR\n\n", raio);
					System.out.printf("Responda => ");
					confirmar = ler.nextInt();

					circulosLista.add(c);
					area = c.calcularCirculoArea(raio);
					perimetro = c.calcularCirculoPerimetro(raio);

					System.out.printf("Circulo de raio " + raio + " cadastrado com sucesso");
					System.out.printf("Area do circulo igual a ", area);
					System.out.printf("Circunferencia do circulo igual a ", perimetro);
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 2) {

				do {

					Quadrado q = new Quadrado();

					id = quadrilateroLista.size() + 1;
					q.setId(id);

					double lado1;
					double lado2;
					double lado3;
					double lado4;

					try {

						System.out.printf("Digite o tamanho do lado da base inferior (1) => ");
						lado1 = ler.nextInt();
						q.setLado(lado1);

						System.out.printf("Digite o tamanho do lado esquerdo vertical (2) => ");
						lado2 = ler.nextInt();
						q.setLado(lado2);

						System.out.printf("Digite o tamanho do lado direito vertical (3) => ");
						lado3 = ler.nextInt();
						q.setLado(lado3);

						System.out.printf("Digite o tamanho da base oposta topo (4) => ");
						lado4 = ler.nextInt();
						q.setLado(lado4);

						area = q.calcularRetanguloArea(lado1, lado2);
						perimetro = q.calculaQuadrilateroPerimetro(lado1, lado2, lado3, lado4);
						quadrilateroLista.add(q);

						System.out.printf("Perametro: ", perimetro);
						q.setPerimetro(perimetro);

						System.out.printf("area: ", area);

					} catch (Exception e) {
						System.out.printf("Necessario digitar um numero");
					}

					System.out.printf("As informacoes estao corretas?\n\n" +
							"0 - REFAZER\n" +
							"1 - CONFIRMAR\n\n");
					System.out.printf("Responda => ");

					confirmar = ler.nextInt();

					if (confirmar == 1) {
						quadrilateroLista.add(q);
					}

					System.in.read();

					if (quadrilateroLista.size() >= 1) {
						for (int i = 0; i < quadrilateroLista.size(); i++) {
							System.out.printf("ID %d - Quadrado: %s  \nPerimetro: %s \n Area: %s", q.getId(),
									q.getPerimetro(), q.getArea());

						}
					}

				} while (confirmar != 1);

			} else if (option == 3) {

				do {

					Triangulo t = new Triangulo();

					id = trianguloLista.size() + 1;
					t.setId(id);

					double base;
					double lado1;
					double lado2;
					double altura;

					try {
						System.out.printf("Digite o tamanho do lado da base (1) => ");
						base = ler.nextInt();
						t.setLado(base);

						System.out.printf("Digite o tamanho do lado esquerdo (2) => ");
						lado1 = ler.nextInt();
						t.setLado(lado1);

						System.out.printf("Digite o tamanho do lado direito (2) => ");
						lado2 = ler.nextInt();
						t.setLado(lado2);

						System.out.printf("Digite a altura do triangulo => ");
						altura = ler.nextInt();
						t.setLado(altura);

						// copiar este modelo nos de cima
						perimetro = t.calculaTrianguloPerimetro(base, lado1, lado2);
						t.setPerimetro(perimetro);

						area = t.calculaTrianguloArea(altura, base, lado1, lado2);
						t.setArea(area);

						System.out.printf("Quadrilatero criado com sucesso");
						System.out.printf("Perametro: ", perimetro);
						System.out.printf("area: ", area);

					} catch (Exception e) {
						System.out.printf("Necessario que seja digitado apenas numeros.");
					}

					System.out.printf("As informacoes estao corretas?\n\n" +
							"0 - REFAZER\n" +
							"1 - CONFIRMAR\n\n");
					System.out.printf("Responda => ");
					confirmar = ler.nextInt();

					if (confirmar == 1) {
						trianguloLista.add(t);
					}

					System.in.read();

				} while (confirmar != 1);
			}
		} while (option != 4);

		ler.close();
	}

}
