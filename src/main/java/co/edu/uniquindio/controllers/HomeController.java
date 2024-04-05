// ClienteController.java
package co.edu.uniquindio.controllers;

import co.edu.uniquindio.model.dto.ClienteDTO;
import co.edu.uniquindio.services.interfaces.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<Map<String,String>> healthcheck() {
        return ResponseEntity.ok().body(Map.of("Status","Bienvenido"));
    }

}