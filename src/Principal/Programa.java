package Principal;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

public class Programa {
	
	public static void main(String[] args) {
		
		
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();


		cc.depositar(150);
		cc.transferir(100, cp);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
		
	}

}
