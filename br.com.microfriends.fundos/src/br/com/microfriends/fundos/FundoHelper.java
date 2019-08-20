package br.com.microfriends.fundos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FundoHelper {
	
	private ArrayList<Fundo> ListFundosCadastrados = new ArrayList<Fundo>();
	
	public void CadastroFundo() {
		
		try {
		Scanner input = new Scanner(System.in);
		Fundo fundoCadastrando = new Fundo();
		
		System.out.println("Cadastro de Fundo");
		
		System.out.println("Qual o nome do fundo ?");
		fundoCadastrando.setNome(input.nextLine());
		
		System.out.println("Qual tipo do fundo ? (ACAO(1), MULTI-MERCADO(2), RENDA-FIXA(3)");
		fundoCadastrando.setTipo(Integer.parseInt(input.nextLine()));
		
		System.out.println("Qual a descrição do fundo ?");
		fundoCadastrando.setDescricao(input.nextLine());
		
		System.out.println("Qual o valor da cota ?");
		fundoCadastrando.setValorDaCota(Integer.parseInt(input.nextLine()));
		
		System.out.println("Qual a quantidade de cotas totais ?");
		fundoCadastrando.setQuantidadeCotasTotal(Integer.parseInt(input.nextLine()));
		
		System.out.println("Qual a quantidade de cotas disponíveis ?");
		fundoCadastrando.setQuantidadeCotasDisponiveis(Integer.parseInt(input.nextLine()));
		
		System.out.println("Qual a quantidade mínima de cotas ?");
		fundoCadastrando.setQuantidadeMinimaCotas(Integer.parseInt(input.nextLine()));
		
		fundoCadastrando.setCodigo(2);
		
		ListFundosCadastrados.add(fundoCadastrando);
		
		System.out.println("Quantidade fundos cadastrados: " + ListFundosCadastrados.size());
		
		System.out.println("Fundo " + fundoCadastrando.getNome() + " Cadastrado com sucesso! Código: " + fundoCadastrando.getCodigo());
		} catch (Exception ex) {
			System.err.println("Erro insercao " + ex.getMessage());
		}
		
	}
	
	public void ListarFundos() {
		
		AddFundoTeste();
		
		System.out.println("Quantidade de fundos cadastrados: " + ListFundosCadastrados.size());
		
		for(Fundo fundo : ListFundosCadastrados) {
			
			System.out.println("Fundo: " + fundo.getNome());
			System.out.println("Código: " + fundo.getCodigo());
			System.out.println("Tipo: " + fundo.getTipo());
			System.out.println("Valor da cota: R$" + fundo.getValorDaCota());
			System.out.println("Quantidade cotas totais: " + fundo.getQuantidadeCotasTotal());
			System.out.println("Cotas disponiveis: " + fundo.getQuantidadeCotasDisponiveis());
			System.out.println("Clientes:");
			
			for(Cliente cliente : fundo.getClientes()) {
				System.out.println("Nome: " + cliente.getNome() + ", QTD COTAS: " + cliente.getQuantidadeCotas());
			}
			
			for(int i = 0; i < 3; i++)
			{
			       System.out.println("");
			}
		}
	}
	
	public void AddFundoTeste() {
		
		Fundo fundoTeste = new Fundo();
		
		fundoTeste.setNome("Fundo Inicial");
		fundoTeste.setCodigo(1);
		fundoTeste.setDescricao("Fundo Inicial com viés de teste");
		fundoTeste.setTipo(1);
		fundoTeste.setValorDaCota(100);
		fundoTeste.setQuantidadeCotasDisponiveis(1000);
		fundoTeste.setQuantidadeCotasTotal(1500);
		fundoTeste.setQuantidadeMinimaCotas(100);
		fundoTeste.setValorDaCota(50);
		
		ListFundosCadastrados.add(fundoTeste);
		
		Fundo fundoTeste2 = new Fundo();
		
		fundoTeste2.setNome("Fundo Inicial2");
		fundoTeste2.setCodigo(1);
		fundoTeste2.setDescricao("Fundo Inicial com viés de teste2");
		fundoTeste2.setTipo(1);
		fundoTeste2.setValorDaCota(100);
		fundoTeste2.setQuantidadeCotasDisponiveis(1000);
		fundoTeste2.setQuantidadeCotasTotal(1500);
		fundoTeste2.setQuantidadeMinimaCotas(100);
		fundoTeste2.setValorDaCota(50);
		
		ListFundosCadastrados.add(fundoTeste2);
	}
}
