package com.springSecurity.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pagos")
public class PagosController {

    @GetMapping
    public List<PagoDTO> getPagos(){
        return List.of(new PagoDTO(UUID.randomUUID(), 1000),
                       new PagoDTO(UUID.randomUUID(), 5500)
                );
    }

}
