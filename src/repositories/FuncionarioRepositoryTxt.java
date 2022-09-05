package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.IFuncionarioRepository;

public class FuncionarioRepositoryTxt implements IFuncionarioRepository {

	@Override
	public void exportarArquivo(Funcionario funcionario) throws Exception {

		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("\\C:\\temp\\Funcionario.txt"), true));

		// escrevendo os dados do arquivo
		printWriter.write("\nId do Funcionário..........:" + funcionario.getId());
		printWriter.write("\nNome do Funcionário........:" + funcionario.getNome());
		printWriter.write("\nMatricula do Funcionário...:" + funcionario.getMatricula());
		printWriter.write("\nCPF do Funcionário.........:" + funcionario.getCpf());
		printWriter.write("\nData de Admissão...........:" + funcionario.getDataAdimissao());
		printWriter.write("\nID do Setor................:" + funcionario.getSetor().getIdSetor());
		printWriter.write("Sigla do setor...............:" + funcionario.getSetor().getSigla());
		printWriter.write("\nNome do setor..............:" + funcionario.getSetor().getNome());
		printWriter.write("\n.......");

		// salvando e fechando o arquivo
		printWriter.flush();
		printWriter.close();

	}

}
