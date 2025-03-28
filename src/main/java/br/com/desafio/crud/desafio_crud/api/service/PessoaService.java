package br.com.desafio.crud.desafio_crud.api.service;


import br.com.desafio.crud.desafio_crud.domain.entity.Pessoa;
import br.com.desafio.crud.desafio_crud.domain.entity.Endereco;
import br.com.desafio.crud.desafio_crud.domain.repository.EnderecoRepository;
import br.com.desafio.crud.desafio_crud.domain.repository.PessoaRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;
    private EnderecoRepository enderecoRepository;

    public PessoaService(PessoaRepository pessoaRepository, EnderecoRepository enderecoRepository) {
        this.pessoaRepository = pessoaRepository;
        this.enderecoRepository = enderecoRepository;
    }

    @Transactional
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }
    @Transactional
    public Pessoa atualizarPessoa(Long id, Pessoa pessoaAtualizada) {
        Pessoa pessoaExistente = pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        // Atualiza os dados básicos da pessoa
        pessoaExistente.setNome(pessoaAtualizada.getNome());
        pessoaExistente.setCpf(pessoaAtualizada.getCpf());
        pessoaExistente.setDataNascimento(pessoaAtualizada.getDataNascimento());

        // Atualiza os endereços
        pessoaExistente.getEnderecos().clear();
        for (Endereco endereco : pessoaAtualizada.getEnderecos()) {
            endereco.setPessoa(pessoaExistente); // Relaciona o endereço à pessoa
            pessoaExistente.getEnderecos().add(endereco);
        }

        return pessoaRepository.save(pessoaExistente);
    }
    @Transactional
    public Pessoa criarPessoa(Pessoa pessoa) {
        for (Endereco endereco : pessoa.getEnderecos()) {
            endereco.setPessoa(pessoa);
        }
        return pessoaRepository.save(pessoa);
    }

    @Transactional
    public void excluirPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }

    @Transactional
    public Integer calcularIdade(Long id) {
        Optional<Pessoa> pessoaOpt = pessoaRepository.findById(id);
        if (pessoaOpt.isEmpty()) {
            throw new RuntimeException("Pessoa não encontrada!");
        }
        Pessoa pessoa = pessoaOpt.get();
        return Period.between(pessoa.getDataNascimento(), LocalDate.now()).getYears();
    }
}
