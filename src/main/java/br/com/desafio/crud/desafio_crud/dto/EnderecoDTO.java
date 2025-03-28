package br.com.desafio.crud.desafio_crud.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EnderecoDTO implements Serializable {

    private static final Long serialVersionUID = 1L;


    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank(message = "Rua é obrigatória")
    @Size(max = 150, message = "Rua deve ter no máximo 150 caracteres")
    private String rua;

    @NotNull(message = "Número é obrigatório")
    @Min(value = 1, message = "Número deve ser positivo")
    private Integer numero;

    @NotBlank(message = "Bairro é obrigatório")
    @Size(max = 100, message = "Bairro deve ter no máximo 100 caracteres")
    private String bairro;

    @NotBlank(message = "Cidade é obrigatória")
    @Size(max = 100, message = "Cidade deve ter no máximo 100 caracteres")
    private String cidade;

    @NotBlank(message = "Estado é obrigatório")
    @Size(min = 2, max = 2, message = "Estado deve ter 2 caracteres")
    private String estado;

    @NotBlank(message = "CEP é obrigatório")
    @Size(min = 9, max = 9, message = "CEP deve ter 9 caracteres")
    private String cep;



    // Construtores
    public EnderecoDTO() {}

    public EnderecoDTO(Long id, String rua, Integer numero, String bairro, String cidade, String estado, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

}

