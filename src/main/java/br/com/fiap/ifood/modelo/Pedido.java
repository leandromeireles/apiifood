package br.com.fiap.ifood.modelo;

import br.com.fiap.ifood.controller.form.PedidoForm;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private String mensagem;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private StatusPedido status = StatusPedido.ABERTO;
	@OneToOne
	private Item item;
	@OneToOne
	private Usuario usuario;
	@OneToOne
	private Restaurante restaurante;

	
	public Pedido() {
	}

	public Pedido(String numero, String mensagem, Restaurante restaurante) {

		this.numero = numero;
		this.mensagem = mensagem;
		this.restaurante = restaurante;
	}
	public Pedido(PedidoForm form, Item item, Usuario usuario, Restaurante restaurante) {

		this.numero = form.getNumero();
		this.item = form.getItem();
		this.mensagem = form.getMensagem();
		this.dataCriacao = form.getDataCriacao();
		this.status = form.getStatus();
		this.usuario = form.getUsuario();
		this.restaurante = form.getRestaurante();
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String titulo) {
		this.numero = titulo;
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
