package br.com.desafio.crud.desafio_crud.domain.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.Instant;


@Entity
@Table(name = "endereco")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Endereco implements Serializable {

    private static final Long serialVersionUID = 1L;



    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "rua", nullable = false, length = 150)
    private String rua;

    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "bairro", nullable = false, length = 100)
    private String bairro;

    @Column(name = "cidade", nullable = false, length = 100)
    private String cidade;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdUpdateAt;

    public Endereco(Long id) {
        this.id = id;
    }
    public Endereco(Long id, String rua, Integer numero, String bairro, String cidade, String estado, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
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
