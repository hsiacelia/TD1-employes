package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Commercial extends Employe{

    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(String name, String surname, int num_em, int num_secu, int ladder, LocalDate naissance, LocalDate embauche, double bases, double heure, double taux, double chiffre) {
        super(name, surname, num_em, num_secu, ladder, naissance, embauche, bases, heure);
        setChiffreAffaires(chiffre);
        setTauxCommission(taux);

    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    public void negocierTransaction() {
        System.out.println("Je négocie une transaction");
    }

    public double salaireBrute() {
        return getBase() + chiffreAffaires * tauxCommission;
    }
}
