package fr.univ_amu.iut.exo3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Entreprise {
    private String nom;
    private Vector listeEmploye = new Vector<Employe>();

    public Entreprise(String name){
        setNom(name);
    }

    public String getNom() {
        return nom;
    }


    public void setNom(String newName) {
        this.nom = newName;
    }

    public void setListeEmploye(Vector<Employe> listeEmploye) {
        this.listeEmploye = listeEmploye;
    }

    public Vector<Employe> getListeEmploye() {
        return listeEmploye;
    }

    public String toString () {
        return "Entreprise : " + nom +
                "Liste des employés : " + listeEmploye;
    }

    public void addEmploye(Employe nouveau) {
        this.listeEmploye.addElement(nouveau);
    }

    public void deleteEmploye(Employe enlever) {
        this.listeEmploye.removeElement(enlever);
    }

    public int compare (Employe e1, Employe e2) {
        long nb1 = ChronoUnit.MONTHS.between(e1.getDate_embauche(), LocalDate.now());
        long nb2 = ChronoUnit.MONTHS.between(e2.getDate_embauche(), LocalDate.now());
        int nbi1 = ((Long)nb1).intValue();
        int nbi2 = ((Long)nb2).intValue();
        return nbi1 - nbi2;
    }

    public boolean equals(Employe e1, Employe e2) {
        return(e1.getDate_embauche() == e2.getDate_embauche());
    }


}
