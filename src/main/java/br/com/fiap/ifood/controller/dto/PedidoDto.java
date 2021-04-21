package br.com.fiap.ifood.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.fiap.ifood.domain.*;

public class PedidoDto {

    private Long id;
    private String numero;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private StatusPedido statusPedido;
    private Item item;
    private Usuario usuario;
    private Restaurante restaurante;

    public PedidoDto(Pedido pedido) {
        this.id = pedido.getId();
        this.numero = pedido.getNumero();
        this.mensagem = pedido.getMensagem();
        this.dataCriacao = pedido.getDataCriacao();
        this.statusPedido = pedido.getStatus();
        this.item = pedido.getItem();
        this.usuario = pedido.getUsuario();
        this.restaurante = pedido.getRestaurante();

    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


}
