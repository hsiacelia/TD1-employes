package fr.univ_amu.iut.exo1;

import java.util.Vector;


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

}
