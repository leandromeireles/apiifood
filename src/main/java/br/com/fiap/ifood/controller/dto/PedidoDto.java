package br.com.fiap.ifood.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.fiap.ifood.modelo.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class PedidoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private StatusPedido statusPedido;
    private Usuario usuario;
    private Restaurante restaurante;


    public PedidoDto(Pedido pedido) {
        this.id = pedido.getId();
        this.titulo = pedido.getTitulo();
		this.mensagem = pedido.getMensagem();
		this.dataCriacao = pedido.getDataCriacao();
		this.statusPedido = pedido.getStatus();
		this.restaurante = pedido.getRestaurante();
		this.usuario = pedido.getAutor();

	}

    public PedidoDto(Restaurante restaurante, Usuario usuario, String titulo, String mensagem, LocalDateTime dataCriacao, StatusPedido statusPedido) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public static List<PedidoDto> converter(List<Pedido> pedidos) {
        return pedidos.stream().map(PedidoDto::new).collect(Collectors.toList());
    }

    public static PedidoDto converterItem(Pedido pedido) {
        PedidoDto pedidoDto = new PedidoDto(pedido.getRestaurante(), pedido.getAutor(), pedido.getTitulo(), pedido.getMensagem(), pedido.getDataCriacao(), pedido.getStatus());

        return pedidoDto;
    }

}
