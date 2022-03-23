package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "annonce")
public class Annonce {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long annonceID;
    private  String title;
    private  String contenu;

    @ManyToOne
    @JoinColumn
    private  Secteur secteur;

    @ManyToOne()
    @JoinColumn
    private  Client client;

    public Annonce() {
    }

    public Annonce(long annonceID, String title, String contenu) {
        this.annonceID = annonceID;
        this.title = title;
        this.contenu = contenu;
    }

    public long getAnnonceID() {
        return annonceID;
    }

    public void setAnnonceID(long annonceID) {
        this.annonceID = annonceID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
