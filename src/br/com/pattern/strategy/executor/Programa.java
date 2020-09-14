package br.com.pattern.strategy.executor;

import br.com.pattern.strategy.behavior.IComportamento;
import br.com.pattern.strategy.client.ClienteComportamento;
import br.com.pattern.strategy.concretebehavior.ComportamentoConcretoA;
import br.com.pattern.strategy.concretebehavior.ComportamentoConcretoB;

public class Programa {

	public static void main(String[] args) {
		
		IComportamento compA = new ComportamentoConcretoA();
		IComportamento compB = new ComportamentoConcretoB();
		
		ClienteComportamento clienteA = new ClienteComportamento(compA);
		clienteA.executarComportamento();

		ClienteComportamento clienteB = new ClienteComportamento(compB);
		clienteB.executarComportamento();
	}

}
