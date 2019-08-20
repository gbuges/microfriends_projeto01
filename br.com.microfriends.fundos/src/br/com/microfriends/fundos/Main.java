package br.com.microfriends.fundos;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		RotinaInicial();

	}

	public static void RotinaInicial() {
		
		FundoHelper fundoHelper = new FundoHelper();
		
		switch(MenuInicial()) {
		case 1:
			fundoHelper.CadastroFundo();	
			break;
			
		case 2:
			fundoHelper.ListarFundos();
			break;
			
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
			
		case 99:
			try {
			System.out.println("Opção invalida.");	
			TimeUnit.SECONDS.sleep(2);
			clearConsole();
			RotinaInicial();
			break;
			} catch (Exception ex) {
				System.err.println("Erro");
			}
		}
		
		RotinaInicial();
	}

	private static int MenuInicial() {

		Scanner input = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("1 - Cadastrar novo Fundo");
		System.out.println("2 - Listar Fundos");
		System.out.println("3 - Remover Fundo");
		System.out.println("4 - Aplicar Fundo");
		System.out.println("5 - Resgatar Fundo");

		System.out.println("Opcao desejada: ");

		try {
			Integer opcao = Integer.parseInt(input.nextLine());
			return opcao;
		} catch (Exception ex) {
			return 99;
		}

	}

	public static void clearConsole()
	{
		for(int i = 0; i < 20; i++)
		{
		       System.out.println("");
		}
	}
	

}
