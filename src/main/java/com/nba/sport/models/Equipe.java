package com.nba.sport.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Equipe")
public class Equipe {
    @Id
    String id ;
    @Column(name = "nom")
    String nom ;
    @Column(name="abreviation")
    String abreviation ;
    public Equipe(String id, String nom, String abreviation) {
        this.id = id;
        this.nom = nom;
        this.abreviation = abreviation;
    }
    public Equipe() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAbreviation() {
        return abreviation;
    }
    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }
   

}
