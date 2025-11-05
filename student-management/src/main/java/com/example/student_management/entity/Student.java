package com.example.student_management.entity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

    @Entity
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String nom;
        private String prenom;

        @Column(name = "date_naissance")
        private LocalDate dateNaissance;


        // Getters et Setters
        public Integer getId() { return id; }
        public void setId(Integer id) { this.id = id; }
        public String getNom() { return nom; }
        public void setNom(String nom) { this.nom = nom; }
        public String getPrenom() { return prenom; }
        public void setPrenom(String prenom) { this.prenom = prenom; }
        public LocalDate getDateNaissance(){ return dateNaissance; }
        public void setDateNaissance(LocalDate d){ this.dateNaissance=d; }

    }

