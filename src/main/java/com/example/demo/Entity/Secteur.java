package com.example.demo.Entity;

import  javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Secteur")
public class Secteur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long secteurId;

    private  String libele;

    @OneToMany(mappedBy = "secteur", fetch = FetchType.LAZY)
    private Collection<Prestataire> prestataires;

    @OneToMany(mappedBy = "secteur", fetch = FetchType.LAZY)
    private  Collection<Annonce> annonceBySectors;

    public Secteur() {
    }

    public Secteur(long secteurId, String libele) {
        this.secteurId = secteurId;
        this.libele = libele;
    }

    public long getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(long secteurId) {
        this.secteurId = secteurId;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }
}
