package com.springSecurity.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public List<UsuarioDTO> getUsuarios(){
        return List.of(new UsuarioDTO(UUID.randomUUID(), "Paco"),
                       new UsuarioDTO(UUID.randomUUID(), "Luis")
        );
    }
}
