package com.algaworks.pagamento.operadoras;

import com.algaworks.pagamento.Autorizavel;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;

public class Cielo implements Operadora{

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		// Cada operadora vai fazer de um jeito, isso é um exemplo
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}

}
