package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Ordinaire extends Employe {

    public Ordinaire(String name, String surname, int num_em, int num_secu, int ladder, LocalDate naissance, LocalDate embauche, double bases, double heure) {
        super(name, surname, num_em, num_secu, ladder, naissance, embauche, bases, heure);
    }

    public void effectuerTacheOrdinaire() {
        System.out.println("J'effectue une tâche ordinaire ");
    }

    public double salaireBrute (){
        return getBase() * getNbHeures() + getEchelon() * 100;
    }

}
