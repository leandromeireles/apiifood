package br.com.fiap.ifood.controller.form;

import br.com.fiap.ifood.domain.Item;

public class AtualizarPedidoForm {

    private String mensagem;
    private Item item;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
