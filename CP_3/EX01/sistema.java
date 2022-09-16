package EX01;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class sistema {

	    public static void main(String[] args) throws IOException {

	        Scanner ler = new Scanner(System.in);

	        ArrayList<ContaCorrente> contasCorrentesList = new ArrayList<>();
	        ArrayList<ContaPoupanca> contasPoupancasList = new ArrayList<>();
	        ArrayList<ContaSalario> contasSalariosList = new ArrayList<>();

	        int option = 0;
	        String agencia;
	        String numero;
	        double saldo;

	        double rentabilidade;
	        double chequeEspecial;
	        int cnpj;

	        int confirmar;

	        System.out.printf("SISTEMA DE CADASTRO DE CONTA \n\n" +
	                "Informe qual o tipo de conta voce deseja:\n" +
	                "1) Conta corrente\n" +
	                "2) Conta poupanca\n" +
	                "3) Conta salario\n\n");
	        System.out.printf("Digite a opcao desejada: ");

	        option = ler.nextInt();

	        if (option == 1) {

	            do {

	                ContaCorrente cc = new ContaCorrente();

	                System.out.printf("Digite a agencia => ");
	                agencia = ler.next();
	                cc.setAgencia(agencia);

	                System.out.printf("Digite o numero => ");
	                numero = ler.next();
	                cc.setNumero(numero);

	                System.out.printf("Digite quanto deseja depositar => ");
	                saldo = ler.nextDouble();
	                cc.setSaldo(saldo);

	                System.out.printf("Digite o limite de cheque especial => ");
	                chequeEspecial = ler.nextDouble();
	                cc.setChequeEspecial(chequeEspecial);

	                System.out.printf("As informacoes estao corretas?\n\n" +
	                        "0 - REFAZER\n" +
	                        "1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");

	                confirmar = ler.nextInt();

	                contasCorrentesList.add(cc);

	                System.out.printf("Conta corrente criada com sucesso");
	                System.in.read();

	            } while (confirmar != 0);

	        } else if (option == 2) {

	            do {

	                ContaPoupanca cp = new ContaPoupanca();

	                System.out.printf("Digite a agencia => ");
	                agencia = ler.next();
	                cp.setAgencia(agencia);

	                System.out.printf("Digite o numero => ");
	                numero = ler.next();
	                cp.setNumero(numero);

	                System.out.printf("Digite quanto deseja depositar => ");
	                saldo = ler.nextDouble();
	                cp.setSaldo(saldo);

	                System.out.printf("Digite o valor da taxa de rentabilidade desejada => ");
	                rentabilidade = ler.nextDouble();
	                cp.setRentabilidade(rentabilidade);

	                System.out.printf("As informacoes estao corretas?\n\n" +
	                        "0 - REFAZER\n" +
	                        "1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");

	                confirmar = ler.nextInt();

	                contasPoupancasList.add(cp);

	                System.out.printf("Conta poupanca criada com sucesso");
	                System.in.read();

	            } while (confirmar != 0);
	        } else if (option == 3) {

	            do {

	                ContaSalario cs = new ContaSalario();

	                System.out.printf("Digite a agencia => ");
	                agencia = ler.next();
	                cs.setAgencia(agencia);

	                System.out.printf("Digite o numero => ");
	                numero = ler.next();
	                cs.setNumero(numero);

	                System.out.printf("Digite quanto deseja depositar => ");
	                saldo = ler.nextDouble();
	                cs.setSaldo(saldo);

	                System.out.printf("Digite o valor da taxa de rentabilidade desejada => ");
	                cnpj = ler.nextInt();
	                cs.setCnpjEmpregador(cnpj);

	                System.out.printf("As informacoes estao corretas?\n\n" +
	                        "0 - REFAZER\n" +
	                        "1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");

	                confirmar = ler.nextInt();

	                contasSalariosList.add(cs);

	                System.out.printf("Conta corrente criada com sucesso");
	                System.in.read();

	            } while (confirmar != 0);

	        } else {

	            System.out.printf("Escolha um numero de 0 a 2");

	        }

	        ler.close();

	    }
	
}
