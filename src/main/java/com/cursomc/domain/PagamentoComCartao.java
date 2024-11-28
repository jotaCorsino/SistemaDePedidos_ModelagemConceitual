package com.cursomc.domain;

import com.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;

	private Integer NumeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estadoPagamento, pedido);
		
		NumeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return NumeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		NumeroDeParcelas = numeroDeParcelas;
	}
	
	
}
