package br.com.microfriends.fundos;

import java.util.ArrayList;

public class Fundo {
	
	private String Nome;
	private int Codigo;
	private int Tipo;
	private float ValorDaCota;
	private int QuantidadeCotasTotal;
	private int QuantidadeCotasDisponiveis;
	private int QuantidadeMinimaCotas;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> cliente) {
		clientes.addAll(cliente);
	}
	private String Descricao;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public float getValorDaCota() {
		return ValorDaCota;
	}
	public void setValorDaCota(float valorDaCota) {
		ValorDaCota = valorDaCota;
	}
	public int getQuantidadeCotasTotal() {
		return QuantidadeCotasTotal;
	}
	public void setQuantidadeCotasTotal(int quantidadeCotasTotal) {
		QuantidadeCotasTotal = quantidadeCotasTotal;
	}
	public int getQuantidadeCotasDisponiveis() {
		return QuantidadeCotasDisponiveis;
	}
	public void setQuantidadeCotasDisponiveis(int quantidadeCotasDisponiveis) {
		QuantidadeCotasDisponiveis = quantidadeCotasDisponiveis;
	}
	public int getQuantidadeMinimaCotas() {
		return QuantidadeMinimaCotas;
	}
	public void setQuantidadeMinimaCotas(int quantidadeMinimaCotas) {
		QuantidadeMinimaCotas = quantidadeMinimaCotas;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

}
