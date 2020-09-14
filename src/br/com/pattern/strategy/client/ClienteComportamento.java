package br.com.pattern.strategy.client;

import br.com.pattern.strategy.behavior.IComportamento;

public class ClienteComportamento {

	private IComportamento iComportamento;

	public ClienteComportamento(IComportamento iComportamento) {
		this.iComportamento = iComportamento;
	}

	public void executarComportamento() {
		iComportamento.comportamento();
	}

}
