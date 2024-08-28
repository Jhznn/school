package escola.api.school.controller;

import escola.api.school.Funcionario;
import escola.api.school.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

        private final FuncionarioService funcionarioService;

        public FuncionarioController(FuncionarioService funcionarioService) {
            this.funcionarioService = funcionarioService;
        }

        @PostMapping
        public ResponseEntity <Funcionario> cadastrarFuncionario(@RequestBody Funcionario funcionario){
            Funcionario novoFuncionario = funcionarioService.cadastrarFuncionario(funcionario);
            return ResponseEntity.status(HttpStatus.CREATED).body(novoFuncionario);
        }
    }

