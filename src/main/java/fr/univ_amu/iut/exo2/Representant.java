package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Representant extends Commercial{


    public Representant(String name, String surname, int num_em, int num_secu, int ladder, LocalDate naissance, LocalDate embauche, double bases, double heure, double taux, double chiffre) {
        super(name, surname, num_em, num_secu, ladder, naissance, embauche, bases, heure, taux, chiffre);
    }

    @Override
    public double salaireBrute() {
        return getBase()*getNbHeures();
    }
}
