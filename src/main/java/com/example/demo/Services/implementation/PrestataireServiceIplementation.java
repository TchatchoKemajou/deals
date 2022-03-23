package com.example.demo.Services.implementation;

import com.example.demo.Entity.Prestataire;
import com.example.demo.Repository.PrestataireRepository;
import com.example.demo.Services.PrestataireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("Pres")
public class PrestataireServiceIplementation implements PrestataireService {

    @Autowired
    private PrestataireRepository prestataireRepository;

    @Override
    public List<Prestataire> getAllPrestataires() {
        return prestataireRepository.findAll();
    }

    @Override
    public Prestataire getprestataireByEmail(String email) {
        List<Prestataire> prestataires = prestataireRepository.findAll();
        for(Prestataire prestataire:prestataires){
            if(prestataire.getMail().equals(email)){
                return  prestataire;
            }
        }
        return  null;
    }

    @Override
    public List<Prestataire> getAllPrestataireBySecteur(Long id) {
        List<Prestataire> prestataires = prestataireRepository.findAll();
        List<Prestataire> results = null;
        for(Prestataire prestataire:prestataires){
            if (prestataire.getSecteur().equals(id)){
                results.add(prestataire);
            }
        }
        return  results;
    }

    @Override
    public Prestataire addPrestataire(Prestataire prestataire) {
        return  prestataireRepository.save(prestataire);
    }
}
