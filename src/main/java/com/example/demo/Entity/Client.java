package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long clintId;
    private  String nom;
    private  String prenom;


    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private Collection<Annonce> annonceByClients;

    public Client() {
    }

    public Client(Long clintId, String nom, String prenom) {
        this.clintId = clintId;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Long getClintId() {
        return clintId;
    }

    public void setClintId(Long clintId) {
        this.clintId = clintId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
