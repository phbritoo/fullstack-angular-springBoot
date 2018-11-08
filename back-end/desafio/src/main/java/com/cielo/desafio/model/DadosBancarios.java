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
    "codigoBanco",
    "numeroAgencia",
    "numeroContaCorrente"
})
public class DadosBancarios {
	  @JsonProperty("codigoBanco")
	    private Long codigoBanco;
	    @JsonProperty("numeroAgencia")
	    private Long numeroAgencia;
	    @JsonProperty("numeroContaCorrente")
	    private String numeroContaCorrente;
	    @JsonIgnore
	    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	    @JsonProperty("codigoBanco")
	    public Long getCodigoBanco() {
	        return codigoBanco;
	    }

	    @JsonProperty("codigoBanco")
	    public void setCodigoBanco(Long codigoBanco) {
	        this.codigoBanco = codigoBanco;
	    }

	    @JsonProperty("numeroAgencia")
	    public Long getNumeroAgencia() {
	        return numeroAgencia;
	    }

	    @JsonProperty("numeroAgencia")
	    public void setNumeroAgencia(Long numeroAgencia) {
	        this.numeroAgencia = numeroAgencia;
	    }

	    @JsonProperty("numeroContaCorrente")
	    public String getNumeroContaCorrente() {
	        return numeroContaCorrente;
	    }

	    @JsonProperty("numeroContaCorrente")
	    public void setNumeroContaCorrente(String numeroContaCorrente) {
	        this.numeroContaCorrente = numeroContaCorrente;
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
