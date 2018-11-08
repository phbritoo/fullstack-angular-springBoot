package com.cielo.desafio.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quantidadeLancamentos",
    "quantidadeRemessas",
    "valorLancamentos"
})
// Objeto que veio da classe extrato, e contem atributos relacionadaos ao Extrato
public class TotalControleLancamento {

    @JsonProperty("quantidadeLancamentos")
    private Long quantidadeLancamentos;
    @JsonProperty("quantidadeRemessas")
    private Long quantidadeRemessas;
    @JsonProperty("valorLancamentos")
    private Double valorLancamentos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quantidadeLancamentos")
    public Long getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    @JsonProperty("quantidadeLancamentos")
    public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }

    @JsonProperty("quantidadeRemessas")
    public Long getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    @JsonProperty("quantidadeRemessas")
    public void setQuantidadeRemessas(Long quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    @JsonProperty("valorLancamentos")
    public Double getValorLancamentos() {
        return valorLancamentos;
    }

    @JsonProperty("valorLancamentos")
    public void setValorLancamentos(Double valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
