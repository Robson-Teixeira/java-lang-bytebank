package br.com.bytebank.banco.modelo;

/**
 * Objeto de valor com os dados do cliente no Bytebank.
 * 
 * @author Robson Teixeira
 * @version 0.1
 */
public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
