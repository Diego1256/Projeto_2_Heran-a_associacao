package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.IFuncionarioRepository;

public class FuncionarioRepositoryCsv implements IFuncionarioRepository {

	@Override
	public void exportarArquivo(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub

		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("\\C:\\Temp\\funcionarios.csv"),true));
		
		String dados = funcionario.getId() + ";" + funcionario.getNome() + ";"
				+ funcionario.getCpf() + ";" + funcionario.getDataAdimissao() + ";"
				+ funcionario.getSetor().getIdSetor() + ";" + funcionario.getSetor().getSigla() + ";"
				+ funcionario.getSetor().getNome();
		
		printWriter.write(dados);
		
		printWriter.flush();
		printWriter.close();

	}

}
