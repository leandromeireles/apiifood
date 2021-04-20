package br.com.fiap.ifood.controller;

import br.com.fiap.ifood.controller.dto.PedidoDto;
import br.com.fiap.ifood.controller.form.PedidoForm;
import br.com.fiap.ifood.modelo.Pedido;
import br.com.fiap.ifood.repository.PedidoRepository;
import br.com.fiap.ifood.repository.RestauranteRepository;
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
    private RestauranteRepository restauranteRepository;

    @GetMapping("/pedidos")
    public List<PedidoDto> lista() {

        List<Pedido> pedidos = pedidoRepository.findAll();
        return PedidoDto.converter(pedidos);

    }

    @GetMapping("/pedido/{id}")
    public PedidoDto pedido(@RequestParam("id") long id) {
        Pedido pedido = pedidoRepository.findById(id);
        return PedidoDto.converterItem(pedido);
    }

    @PostMapping
    public ResponseEntity<PedidoDto> cadastrar(@RequestBody PedidoForm form, UriComponentsBuilder uriBuilder) {
        Pedido pedido = form.converter(restauranteRepository);
        pedidoRepository.save(pedido);

        URI uri = uriBuilder.path("/pedidos/{id}").buildAndExpand(pedido.getId()).toUri();
        return ResponseEntity.created(uri).body(new PedidoDto(pedido));
    }

}







