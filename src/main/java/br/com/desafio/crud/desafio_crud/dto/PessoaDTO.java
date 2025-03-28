package br.com.desafio.crud.desafio_crud.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PessoaDTO implements Serializable {

    private static final Long serialVersionUID = 1L;


    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 150, message = "Nome deve ter no máximo 150 caracteres")
    private String nome;

    @NotBlank(message = "CPF é obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve ter 11 caracteres")
    private String cpf;

    @NotNull(message = "Data de nascimento é obrigatória")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

    private List<EnderecoDTO> enderecos;

    // Construtores
    public PessoaDTO() {}

    public PessoaDTO(Long id, String nome, String cpf, LocalDate dataNascimento, List<EnderecoDTO> enderecos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
    }

    // Construtor que inicializa a lista e adiciona os endereços um por um
    public PessoaDTO(Long id, String nome, String cpf, LocalDate dataNascimento, EnderecoDTO... enderecos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.enderecos = new ArrayList<>();

        for (EnderecoDTO endereco : enderecos) {
            this.enderecos.add(endereco);
        }
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public List<EnderecoDTO> getEnderecos() { return enderecos; }
    public void setEnderecos(List<EnderecoDTO> enderecos) { this.enderecos = enderecos; }
}