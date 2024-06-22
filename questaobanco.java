package questao;
import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class questaobanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Informe o numero da conta:");
		int numConta = sc.nextInt();
		
		System.out.println("Informe o nome do titular da conta:");
		String nomeTitular = sc.next();
	
	
	System.out.println("Informe se será feito valor de deposito inicial:(S/N)");
	 char resposta = sc.next().charAt(0);
	
	if (resposta == 'S' || resposta == 's') {
		System.out.println("Insira o valor do deposito inicial");
		double depositoinicial = sc.nextDouble();
		conta = new Conta (numConta, nomeTitular, depositoinicial);
	}
	else {
		conta = new Conta (numConta, nomeTitular);

	}
	System.out.println();
	System.out.println("Informações da conta");
	System.out.println(conta);
	
	System.out.println();
	char operacao;
	do {
	System.out.println("Informe qual operação será feita (S/D) ou encerre a sessão apertando outra letra");
	 operacao = sc.next().charAt(0);
	
	if (operacao == 'S' || operacao == 's') {
		System.out.println("Insira o valor do saque");
		double depositoInicial = sc.nextDouble();
		if (conta.getSaldo() <= depositoInicial) {
			System.out.println("Saque invalido:");
		}
		else {
			conta.saque(depositoInicial);
		System.out.println();
		System.out.println("Informações atualizadas da conta");
		System.out.println(conta);
		}
		
	}
	
	else {
		if(operacao == 'D' || operacao == 'd') {
			System.out.println("Insira o valor de deposito");
			double depositoInicial= sc.nextDouble();
			conta.depositar(depositoInicial);
			System.out.println();
			System.out.println("Informações atualizadas da conta");
			System.out.println(conta);
		}
		
		else {
			System.out.println("Sessão encerrada");
			conta = new Conta (numConta, nomeTitular);			

		
} 
	} 
}while(operacao == 'S' || operacao == 'D');
	sc.close();
	}
	
}




