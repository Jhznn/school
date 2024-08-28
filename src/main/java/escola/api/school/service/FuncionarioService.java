package escola.api.school.service;

import escola.api.school.Funcionario;
import escola.api.school.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    public final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public  Funcionario cadastrarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
