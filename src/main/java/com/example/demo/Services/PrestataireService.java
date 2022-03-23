package com.example.demo.Services;

import com.example.demo.Entity.Prestataire;
import com.example.demo.Repository.PrestataireRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PrestataireService {

    public List<Prestataire> getAllPrestataires();

    public  Prestataire getprestataireByEmail(String email);

    public  List<Prestataire> getAllPrestataireBySecteur(Long id);

    public  Prestataire addPrestataire(Prestataire prestataire);

}
