package com.example.demo.Entity;


import javax.persistence.*;


@Entity
@Table(name = "prestataire")
public class Prestataire{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long prestateId;

    private  String nom;

    private  String prenom;

    private  String mail;

    private  String phone;

    private  int age;

    @ManyToOne
    @JoinColumn
    private  Secteur secteur;

    public Prestataire() {
    }

    public Prestataire(Long id, String nom, String prenom, String mail, String phone, int age) {
        prestateId = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.phone = phone;
        this.age = age;
    }

    public Long getPrestateId() {
        return prestateId;
    }

    public void setPrestateId(Long prestateId) {
        this.prestateId = prestateId;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
