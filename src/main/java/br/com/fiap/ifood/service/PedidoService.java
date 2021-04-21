package br.com.fiap.ifood.service;

import br.com.fiap.ifood.controller.dto.PedidoDto;
import br.com.fiap.ifood.controller.form.AtualizarPedidoForm;
import br.com.fiap.ifood.controller.form.PedidoForm;
import br.com.fiap.ifood.domain.Item;
import br.com.fiap.ifood.domain.Pedido;
import br.com.fiap.ifood.domain.Restaurante;
import br.com.fiap.ifood.domain.Usuario;
import br.com.fiap.ifood.repository.ItemRepository;
import br.com.fiap.ifood.repository.PedidoRepository;
import br.com.fiap.ifood.repository.RestauranteRepository;
import br.com.fiap.ifood.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<PedidoDto> converter() {

        List<Pedido> pedidos = pedidoRepository.findAll();

        return pedidos.stream().map(PedidoDto::new).collect(Collectors.toList());
    }

    public PedidoDto converterItem(Long id) {

        Pedido pedido = pedidoRepository.getOne(id);
        PedidoDto pedidoDto = new PedidoDto(pedido);

        return pedidoDto;
    }

    public Pedido converterForm(PedidoForm form) {

        Item item = itemRepository.getOne(form.getItem().getId());
        Usuario usuario = usuarioRepository.getOne(form.getUsuario().getId());
        Restaurante restaurante = restauranteRepository.getOne(form.getRestaurante().getId());

        Pedido pedido = new Pedido(form, item, usuario, restaurante);
        pedidoRepository.save(pedido);

        return pedido;
    }

    public Pedido atualizar(Long id, AtualizarPedidoForm atualizarPedidoForm) {

        Pedido pedido = pedidoRepository.getOne(id);
        pedido.setMensagem(atualizarPedidoForm.getMensagem());
        pedido.setItem(atualizarPedidoForm.getItem());

        return pedido;
    }

    public void remover(Long id) {

        pedidoRepository.deleteById(id);

    }
}
