package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Employe {

    private int num_employe;
    private int num_securite;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate date_naiss;
    private LocalDate date_embauche;
    private double base;
    private double nbHeures;



    public Employe(String name, String surname, int num_em, int num_secu, int ladder, LocalDate naissance, LocalDate embauche, double bases, double heure) {
        setNom(name);
        setPrenom(surname);
        setNum_employe(num_em);
        setNum_securite(num_secu);
        setEchelon(ladder);
        setDateNaiss(naissance);
        setDateEmbauche(embauche);
        setBase(bases);
        setNbHeures(heure);
    }


    public int getNumEmploye() {
        return num_employe;
    }

    public void setNum_employe(int num) {
        this.num_employe = num;
    }

    public int getNum_securite() {
        return num_securite;
    }

    public void setNum_securite(int num) {
        this.num_securite= num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String name) {
        this.nom = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenomnew) {
        this.prenom = prenomnew;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int num) {
        this.echelon = num;
    }

    public LocalDate getDateNaiss() {
        return date_naiss;
    }

    public void setDateNaiss(LocalDate date) {
        this.date_naiss = date;
    }

    public LocalDate getDate_embauche() {
        return date_embauche;
    }

    public void setDateEmbauche(LocalDate date) {
        this.date_embauche = date;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double nb) {
        this.base = nb;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(double heures) {
        this.nbHeures = heures;
    }



    public double salaireBrute() {
        return base*nbHeures;
    }

    public double salaireNet() {
        return salaireBrute()*0.8;
    }


    public String toString() {
        return "Enmploye : " + nom + prenom +
                "Date de naissance : " + date_naiss +
                "Numéro de sécurité : " + num_securite +
                "Echelon : " + echelon +
                "Date d'embauche : " + date_embauche +
                "Base : " + base +
                "Heure : " + nbHeures +
                "Salaire brute" + salaireBrute() +
                "Salaire net : " + salaireNet();
    }


}
