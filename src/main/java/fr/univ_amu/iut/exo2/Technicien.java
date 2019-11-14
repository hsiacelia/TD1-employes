package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Technicien extends Employe{
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Technicien(String name, String surname, int num_em, int num_secu, int ladder, LocalDate naissance, LocalDate embauche, double bases, double heure, int uniteProd, double taux) {
        super(name, surname, num_em, num_secu, ladder, naissance, embauche, bases, heure);
        setTauxCommissionUnite(taux);
        setNbUnitesProduites(uniteProd);
    }

    public void setTauxCommissionUnite(double tauxCommissionUnite) {
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public double getTauxCommissionUnite() {
        return tauxCommissionUnite;
    }

    public void setNbUnitesProduites(int nbUnitesProduites) {
        this.nbUnitesProduites = nbUnitesProduites;
    }

    public int getNbUnitesProduites() {
        return nbUnitesProduites;
    }

    public void fabriquerProduit() {
        System.out.println("Je fabrique un produit");
    }

    public double SalaireBrute() {
        return getBase() * getNbHeures() + nbUnitesProduites * tauxCommissionUnite;
    }
}
