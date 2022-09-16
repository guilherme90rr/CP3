package EX03;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
	import EX02.PessoaFisica;
	import EX02.PessoaJuridica;

	public class Sistema {
		public static void main(String[] args) throws IOException {			
			Scanner ler = new Scanner(System.in);
			ArrayList<ContaSalario> contaSalarioList = new ArrayList<>();
			ArrayList<ContaPoupanca> contaPoupancaList = new ArrayList<>();
			ArrayList<ContaCorrente> contaCorrenteList = new ArrayList<>();
			
			int option;
			
	        String agencia;
	        String numero;
	        double saldo;
	        int cnpj;

	        double rentabilidade;
	        double chequeEspecial;

			int confirmar;
			do {
		        System.out.printf("SISTEMA DE CADASTRO DE CONTA \n\n" +
		                "Escolha qual tipo de conta voc� deseja:\n" +
		                "1) Conta Poupan�a\n" +
		                "2) Conta Corrente\n" +
		                "3) Conta Salario\n" +
		                "4) Sair\n\n");
		        System.out.printf("Digite a op��o desejada: ");
		        
		        option = ler.nextInt();
		        if (option == 1) {
		        	
		        
		        	do {
		        		
			        	ContaPoupanca cp = new ContaPoupanca();
		                System.out.printf("Digite a agencia => ");
		                agencia = ler.next();
		                cp.setAgencia(agencia);

		                System.out.printf("Digite o n�mero => ");
		                numero = ler.next();
		                cp.setNumero(numero);

		                System.out.printf("Digite quanto deseja depositar => ");
		                saldo = ler.nextDouble();
		                cp.setSaldo(saldo);

		                System.out.printf("Digite o limite de cheque especial => ");
		                rentabilidade = ler.nextDouble();
		                cp.setRentabilidade(rentabilidade);

		                
		                System.out.printf("As informa��es est�o corretas?\n\n" +
		    					"0 - REFAZER\n" +
		    					"1 - CONFIRMAR\n\n");
		                System.out.printf("Responda => ");
		    
		                confirmar = ler.nextInt();
		                
		                contaPoupancaList.add(cp);
		                
		                System.out.printf("Pessoa f�sica cadastrada com sucesso");
		                System.in.read();
		                
		        		
		        	} while (confirmar != 1);

		        	
		        } else if (option == 2) {
		        	
		        	do {
			        	ContaCorrente cc = new ContaCorrente();
		                System.out.printf("Digite a agencia => ");
		                agencia = ler.next();
		                cc.setAgencia(agencia);

		                System.out.printf("Digite o n�mero => ");
		                numero = ler.next();
		                cc.setNumero(numero);

		                System.out.printf("Digite quanto deseja depositar => ");
		                saldo = ler.nextDouble();
		                cc.setSaldo(saldo);

		                System.out.printf("Digite o limite de cheque especial => ");
		                chequeEspecial = ler.nextDouble();
		                cc.setChequeEspecial(chequeEspecial);
		                
		                System.out.printf("As informa��es est�o corretas?\n\n" +
		    					"0 - REFAZER\n" +
		    					"1 - CONFIRMAR\n\n");
		                System.out.printf("Responda => ");
		    
		                confirmar = ler.nextInt();
		                
		                contaCorrenteList.add(cc);
		                
		                System.out.printf("Pessoa f�sica cadastrada com sucesso");
		                System.in.read();
		                
		                
		        		
		        	} while (confirmar != 1);
		        } else if (option == 3) {
		        	do {
			        	ContaSalario cs = new ContaSalario();
				        
		                System.out.printf("Digite a agencia => ");
		                agencia = ler.next();
		                cs.setAgencia(agencia);

		                System.out.printf("Digite o n�mero => ");
		                numero = ler.next();
		                cs.setNumero(numero);

		                System.out.printf("Digite quanto deseja depositar => ");
		                saldo = ler.nextDouble();
		                cs.setSaldo(saldo);

		                System.out.printf("Digite o cnpj do empregador => ");
		                cnpj = ler.nextInt();
		                cs.setCnpjEmpregador(cnpj);
		                
		                System.out.printf("As informa��es est�o corretas?\n\n" +
		    					"0 - REFAZER\n" +
		    					"1 - CONFIRMAR\n\n");
		                System.out.printf("Responda => ");
		    
		                confirmar = ler.nextInt();
		                
		                contaSalarioList.add(cs);
		                
		                System.out.printf("Pessoa f�sica cadastrada com sucesso");
		                System.in.read();		
		        	} while (confirmar != 1);
		        	
		        }				
			} while (option != 4);
			ler.close();
		}
}
