package com.market.nf.api.nf.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotaFiscalController {

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok("Hello World :D");
    }

    @GetMapping(value = "byid/{id}")
    public ResponseEntity<?> getById(@NonNull @PathVariable int id) {
        return ResponseEntity.ok(String.format("Id #%d encontrado", id));
    }

    @PostMapping
    public ResponseEntity<?> insert(@RequestBody Object body) {
        return ResponseEntity.ok(body);
    }

    @DeleteMapping
    public ResponseEntity<?> remove(@PathVariable int id) {
        return ResponseEntity.ok(String.format("Id #%d excluído", id));
    }
}
