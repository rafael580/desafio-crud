package br.com.desafio.crud.desafio_crud.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pessoa")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pessoa implements Serializable {

    private static final Long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "cpf", unique = true, nullable = false, length = 11)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Endereco> enderecos = new ArrayList<>();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdUpdateAt;

    public Pessoa() {

    }

    public Pessoa(Long id, String nome, String cpf, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);

    }


    public void removerEndereco(Endereco endereco) {
        this.enderecos.remove(endereco);
    }



    public Instant getCreateAt() {
        return createdAt;
    }

    public Instant getCreateUpdateAt() {
        return createdUpdateAt;
    }

    @PrePersist
    public void prePersist() {
        createdAt = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        createdUpdateAt = Instant.now();
    }



}
