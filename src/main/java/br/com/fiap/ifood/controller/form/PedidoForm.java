package br.com.fiap.ifood.controller.form;

import br.com.fiap.ifood.modelo.*;
import br.com.fiap.ifood.repository.RestauranteRepository;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class PedidoForm {


    private String titulo;
    private String mensagem;
    private String nomePedido;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private StatusPedido status = StatusPedido.ABERTO;
    private Usuario autor;
    private Restaurante restaurante;
    private List<Item> itens = new ArrayList<>();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Pedido converter(RestauranteRepository restauranteRepository) {
        Restaurante restaurante = restauranteRepository.findByNome(nomePedido);
        return new Pedido(titulo, mensagem, restaurante);
    }

}
