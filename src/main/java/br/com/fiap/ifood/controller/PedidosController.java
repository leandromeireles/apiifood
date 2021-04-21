package br.com.fiap.ifood.controller;

import br.com.fiap.ifood.controller.dto.PedidoDto;
import br.com.fiap.ifood.controller.form.AtualizarPedidoForm;
import br.com.fiap.ifood.controller.form.PedidoForm;
import br.com.fiap.ifood.domain.Pedido;
import br.com.fiap.ifood.repository.ItemRepository;
import br.com.fiap.ifood.repository.PedidoRepository;
import br.com.fiap.ifood.repository.RestauranteRepository;
import br.com.fiap.ifood.repository.UsuarioRepository;
import br.com.fiap.ifood.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/apiifood")
public class PedidosController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/pedidos")
    public List<PedidoDto> lista() {

        return pedidoService.converter();
    }

    @GetMapping("/pedido/{id}")
    public PedidoDto pedido(@PathVariable("id") Long id) {

        return pedidoService.converterItem(id);
    }

    @PostMapping("/pedido")
    public ResponseEntity<PedidoDto> cadastrar(@RequestBody PedidoForm form, UriComponentsBuilder uriBuilder) {
        Pedido pedido = pedidoService.converterForm(form);
        URI uri = uriBuilder.path("/pedidos/{id}").buildAndExpand(pedido.getId()).toUri();
        return ResponseEntity.created(uri).body(new PedidoDto(pedido));
    }

    @PutMapping("/pedido/{id}")
    @Transactional
    public ResponseEntity<PedidoDto> atualizar(@PathVariable("id") Long id, @RequestBody AtualizarPedidoForm form) {
        Pedido pedido = pedidoService.atualizar(id, form);
        return ResponseEntity.ok(new PedidoDto(pedido));
    }

    @DeleteMapping("/pedido/{id}")
    public ResponseEntity<?> remover(@PathVariable("id") Long id) {

        pedidoService.remover(id);

        return ResponseEntity.ok().build();

    }

}







