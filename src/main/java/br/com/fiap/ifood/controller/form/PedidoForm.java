package br.com.fiap.ifood.controller.form;

import br.com.fiap.ifood.domain.*;

import br.com.fiap.ifood.repository.ItemRepository;
import br.com.fiap.ifood.repository.RestauranteRepository;
import br.com.fiap.ifood.repository.UsuarioRepository;

import java.time.LocalDateTime;


public class PedidoForm {


    private String numero;
    private Item item;
    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private StatusPedido status = StatusPedido.ABERTO;
    private Usuario usuario;
    private Restaurante restaurante;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }



}
