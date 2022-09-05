package controllers;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Funcionario;
import entities.Setor;
import interfaces.IFuncionarioRepository;
import repositories.FuncionarioRepositoryCsv;
import repositories.FuncionarioRepositoryTxt;

public class FuncionarioController {

	// método para executar o cadastro de um funcionário
	public void CadastrarFuncionario() {

		try {
			Funcionario funcionario = new Funcionario();
			funcionario.setSetor(new Setor());

			funcionario.setId(1);
			funcionario.setNome("Diego Portela");
			funcionario.setCpf("153.846.227-33");
			funcionario.setMatricula("4444-6");
			funcionario.setDataAdimissao(new SimpleDateFormat("DD/MM/YYYY").parse("10/03/2022"));

			funcionario.getSetor().setIdSetor(1);
			funcionario.getSetor().setNome("DESENVOLVIMENTO DE SISTEMAS");
			funcionario.getSetor().setSigla("DESENV");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite (1) para TXT ou (2) para CSV");
			Integer opcao = Integer.parseInt(scanner.nextLine());

			IFuncionarioRepository funcionarioRepository = null;

			switch (opcao) {
			case 1:
				funcionarioRepository = new FuncionarioRepositoryTxt();
				break;

			case 2:
				funcionarioRepository = new FuncionarioRepositoryCsv();
				break;

			default:
				throw new Exception("Opção Inválida");
			}

		} catch (Exception e) {
			System.out.println("\nFalha ao cadastrar o usuário" + e.getMessage());
		}
	}

}
