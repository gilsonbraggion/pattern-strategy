package br.com.pattern.strategy.concretebehavior;

import br.com.pattern.strategy.behavior.IComportamento;

public class ComportamentoConcretoA implements IComportamento {

	@Override
	public String comportamento() {
		String compA = "Este é o comportamento concreto do comportamento A";
		System.out.println(compA);
		return compA;
	}

}
