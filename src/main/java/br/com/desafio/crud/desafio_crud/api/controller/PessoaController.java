package br.com.desafio.crud.desafio_crud.api.controller;



import br.com.desafio.crud.desafio_crud.api.service.PessoaService;
import br.com.desafio.crud.desafio_crud.domain.entity.Pessoa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }


    @GetMapping
    public ResponseEntity<List<Pessoa>> listarPessoas() {
        return ResponseEntity.ok(pessoaService.listarPessoas());
    }


    @PostMapping
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaService.criarPessoa(pessoa));
    }

    @PutMapping("/{id}")
      public ResponseEntity<Pessoa> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
          return ResponseEntity.ok(pessoaService.atualizarPessoa(id, pessoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPessoa(@PathVariable Long id) {
        pessoaService.excluirPessoa(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/idade")
    public ResponseEntity<Integer> calcularIdade(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.calcularIdade(id));
    }
}