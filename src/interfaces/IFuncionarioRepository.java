package interfaces;

import entities.Funcionario;

public interface IFuncionarioRepository {
	void exportarArquivo(Funcionario funcionario) throws Exception;

}
