package br.com.tutoria.cidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidades {
	public Integer getCidade_id() {
		return cidade_id;
	}
	public String getCidade_nome() {
		return cidade_nome;
	}
	public void setCidade_nome(String cidade_nome) {
		this.cidade_nome = cidade_nome;
	}
	public Double getTamanho_cidade() {
		return tamanho_cidade;
	}
	public void setTamanho_cidade(Double tamanho_cidade) {
		this.tamanho_cidade = tamanho_cidade;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cidade_id;
	private String cidade_nome;
	private Double tamanho_cidade;

}
