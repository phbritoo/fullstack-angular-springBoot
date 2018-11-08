
package com.cielo.desafio.model.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cielo.desafio.model.ListaControleLancamento;
import com.cielo.desafio.model.TotalControleLancamento;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalControleLancamento",
    "listaControleLancamento",
    "indice",
    "tamanhoPagina",
    "totalElements"
})

//Classe Extrato aonde estao todos os dados do json
public class Extrato {
	
	//Classe que esta dentro da classe Extrato
    @JsonProperty("totalControleLancamento")
    private TotalControleLancamento totalControleLancamento;
    
    //Uma classe aonde contem uma lista dentro da classe Extrato
    @JsonProperty("listaControleLancamento")
    private List<ListaControleLancamento> listaControleLancamento = null;
    
    @JsonProperty("indice")
    private Long indice;
    @JsonProperty("tamanhoPagina")
    private Long tamanhoPagina;
    @JsonProperty("totalElements")
    private Long totalElements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalControleLancamento")
    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }

    @JsonProperty("totalControleLancamento")
    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    @JsonProperty("listaControleLancamento")
    public List<ListaControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    @JsonProperty("listaControleLancamento")
    public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    @JsonProperty("indice")
    public Long getIndice() {
        return indice;
    }

    @JsonProperty("indice")
    public void setIndice(Long indice) {
        this.indice = indice;
    }

    @JsonProperty("tamanhoPagina")
    public Long getTamanhoPagina() {
        return tamanhoPagina;
    }

    @JsonProperty("tamanhoPagina")
    public void setTamanhoPagina(Long tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    @JsonProperty("totalElements")
    public Long getTotalElements() {
        return totalElements;
    }

    @JsonProperty("totalElements")
    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
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
