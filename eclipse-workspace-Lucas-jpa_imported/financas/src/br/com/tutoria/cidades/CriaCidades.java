package br.com.tutoria.cidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaCidades {
	public static void main(String[] args) {
		Cidades cidade = new Cidades();
		cidade.setCidade_nome("Marrocos");
		cidade.setTamanho_cidade(250000.0);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql_test");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cidade);
		em.getTransaction().commit();
		em.close();
	}
	

}
