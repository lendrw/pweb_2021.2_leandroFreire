package br.com.slurpuff.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Produto {

    private static final long serialVersionUID = -4665511553732190877L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoProduto;

    private String nomeProduto;
    private String marca;
    private Float altura;
    private Float largura;
    private Float profundidade;
    private Float volume;
    private Float precoCompra;
    private Float precoVenda;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataCadastro = new Date();


    public long getCodigoProduto() {
        return this.codigoProduto;
    }

    public void setCodigoProduto(long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getAltura() {
        return this.altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getLargura() {
        return this.largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }

    public Float getProfundidade() {
        return this.profundidade;
    }

    public void setProfundidade(Float profundidade) {
        this.profundidade = profundidade;
    }

    public Float getVolume() {
        return this.volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getPrecoCompra() {
        return this.precoCompra;
    }

    public void setPrecoCompra(Float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Float getPrecoVenda() {
        return this.precoVenda;
    }

    public void setPrecoVenda(Float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public LocalDate getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
