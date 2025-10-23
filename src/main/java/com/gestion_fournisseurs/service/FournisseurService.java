package com.gestion_fournisseurs.service;


import com.gestion_fournisseurs.model.Fournisseur;
import com.gestion_fournisseurs.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurRepository repository;


    public List<Fournisseur> getAll() { return repository.findAll(); }

    public Fournisseur getById(Long id) { return repository.findById(id).orElse(null); }

    public Fournisseur save(Fournisseur f) { return repository.save(f); }
    public Fournisseur update(Long id, Fournisseur f) {
        Fournisseur existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setSociete(f.getSociete());
            existing.setAdresse(f.getAdresse());
            existing.setContact(f.getContact());
            existing.setEmail(f.getEmail());
            existing.setTelephone(f.getTelephone());
            existing.setVille(f.getVille());
            existing.setIce(f.getIce());
            return repository.save(existing);
        }
        return null;
    }
    public void delete(Long id) { repository.deleteById(id); }
}
