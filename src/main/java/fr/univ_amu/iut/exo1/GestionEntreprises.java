package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {


    public static void main(String[] args) {
        Entreprise ent = new Entreprise("maBoiteInfo");
        Employe em = new Employe("hsia",
                "celia",
                2515365,
                41243654,
                2,
                LocalDate.of(1999, Month.OCTOBER, 01),
                LocalDate.of(1999, Month.OCTOBER, 01),
                5,
                64);

        ent.addEmploye(em);

        System.out.println(ent.toString());
        System.out.println(em.toString());
    }
}