package br.com.fiap.ifood.controller;

import br.com.fiap.ifood.controller.dto.PedidoDto;
import br.com.fiap.ifood.controller.form.AtualizarPedidoForm;
import br.com.fiap.ifood.controller.form.PedidoForm;
import br.com.fiap.ifood.modelo.Pedido;
import br.com.fiap.ifood.modelo.Usuario;
import br.com.fiap.ifood.repository.ItemRepository;
import br.com.fiap.ifood.repository.PedidoRepository;
import br.com.fiap.ifood.repository.RestauranteRepository;
import br.com.fiap.ifood.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/apiifood")
public class PedidosController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping("/pedidos")
    public List<PedidoDto> lista() {

        List<Pedido> pedidos = pedidoRepository.findAll();
        return PedidoDto.converter(pedidos);

    }

    @GetMapping("/pedido/{id}")
    public PedidoDto pedido(@PathVariable("id") Long id) {
        Pedido pedido = pedidoRepository.getOne(id);
        return PedidoDto.converterItem(pedido);
    }

    @PostMapping("/pedido")
    public ResponseEntity<PedidoDto> cadastrar(@RequestBody PedidoForm form, UriComponentsBuilder uriBuilder) {
        Pedido pedido = form.converter(form, itemRepository, usuarioRepository, restauranteRepository);

        pedidoRepository.save(pedido);

        URI uri = uriBuilder.path("/pedidos/{id}").buildAndExpand(pedido.getId()).toUri();
        return ResponseEntity.created(uri).body(new PedidoDto(pedido));
    }

    @PutMapping("/pedido/{id}")
    public ResponseEntity<PedidoDto> atualizar(@PathVariable("id") Long id, @RequestBody AtualizarPedidoForm form) {

        return  null;

    }

}







