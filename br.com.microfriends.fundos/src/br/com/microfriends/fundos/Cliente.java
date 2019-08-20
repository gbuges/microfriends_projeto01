package br.com.microfriends.fundos;

public class Cliente {
	
	private String Nome;
	private int Cpf;
	private int[] FundosCadastrados;
	private int QuantidadeCotas;
	
	public int getQuantidadeCotas() {
		return QuantidadeCotas;
	}
	public void setQuantidadeCotas(int quantidadeCotas) {
		QuantidadeCotas = quantidadeCotas;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	public int[] getFundosCadastrados() {
		return FundosCadastrados;
	}
	public void setFundosCadastrados(int[] fundosCadastrados) {
		FundosCadastrados = fundosCadastrados;
	}
}
