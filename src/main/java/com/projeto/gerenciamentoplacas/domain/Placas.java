package com.projeto.gerenciamentoplacas.domain;

import java.io.Serializable;

//Serializable é uma declaração q/ diz q/ a classe implementa a interface Serializable. Ela diz q/ os objetos da classe poderão ser convertidos p/ uma sequência de bytes. Serve p/ q/ os objetos possam ser gravados em arquivos, p/ trafegar em rede, etc.
public class Placas implements Serializable{
	
	private static final long serialVersionUID = 1L;//1ª versão.
	
	private Integer id;
	private String nome;
	private String descricao;
	private String equipamento;
	
	public Placas() {//instancio os objetos s/ jogar nada p/ os atributos.
	}

	public Placas(Integer id, String nome, String descricao, String equipamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.equipamento = equipamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	//P/ q/ dois objetos possam ser comparados pelo seu conteúdo e ñ pelo ponteiro de memória, o objeto tem q/ ter a implementação dos métosos hasCode e equals. Q/ são operações p/ comparar os objetos por valor.
	@Override
	public int hashCode() {//Método q/ gera um código numérico p/ cada objeto.
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {//Método q/ faz a comparação entre dois objetos, considerando várias possibilidades.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Placas other = (Placas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
}
