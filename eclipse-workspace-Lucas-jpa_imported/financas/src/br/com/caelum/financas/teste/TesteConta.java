package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.caelum.financas.modelo.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Leonardo");
		conta.setAgencia("123");
		conta.setBanco("Caixa Economica");
		conta.setNumero("456");
		
		EntityManagerFactory emf = null;
//		EntityManager em = emf;
		
	}

}
