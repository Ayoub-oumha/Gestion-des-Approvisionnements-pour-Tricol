package com.gestion_fournisseurs.controller;


import com.gestion_fournisseurs.model.Fournisseur;
import com.gestion_fournisseurs.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/fournisseurs")
public class FournisseurController {

    @Autowired
    private FournisseurService service;

    @GetMapping
    public List<Fournisseur> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Fournisseur getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Fournisseur create(@RequestBody Fournisseur fournisseur) {
        return service.save(fournisseur);
    }

    @PutMapping("/{id}")
    public Fournisseur update(@PathVariable Long id, @RequestBody Fournisseur fournisseur) {
        return service.update(id, fournisseur);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
